package com.haochh.chen.poseidon.services.imp;

import com.haochh.chen.poseidon.bean.Result;
import com.haochh.chen.poseidon.bean.User;
import com.haochh.chen.poseidon.repository.UserRepository;
import com.haochh.chen.poseidon.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.*;
import static org.springframework.data.domain.ExampleMatcher.matching;

/**
 * Created by admin on 2019/5/19.
 */
@Service
public class UserServicesImp implements UserServices {


    @Autowired
    private UserRepository userRepository;


    @Override
    public Result add(User user) {
        Result result = new Result();
        try {
            if (findOneByName(user).isRet()) {
                result.setData("用户名已存在");
                result.setRet(false);
            } else {
                userRepository.save(user);
                result.setData("添加用户成功");
            }

        } catch (Exception e) {
            result.setData("添加用户失败");
            result.setRet(false);
        }
        return result;
    }

    @Override
    public Result exists(User user) {
        Result result = new Result();
        try {
            Example<User> example = Example.of(user, matching().withIgnorePaths("email", "id"));

            result.setRet(userRepository.exists(example));

            if(userRepository.exists(example)){
                result.setData("登录成功");
            }else {
                result.setData("用户名或者密码错误");
            }
        } catch (Exception e) {

        }
        return result;
    }


    @Override
    public Result findOneByName(User user) {
        Result result = new Result();
        result.setRet(false);
        try {
            Example<User> example = Example.of(user, matching().withMatcher("name", exact())
                    .withIgnorePaths("passwd", "email"));
            Optional<User> optional = userRepository.findOne(example);

            if (optional.isPresent()) {
                result.setData(optional);
                result.setRet(true);
                return  result;
            }
            return result;
        } catch (Exception e) {

        }
        return result;
    }
}
