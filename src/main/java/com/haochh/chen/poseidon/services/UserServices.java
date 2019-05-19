package com.haochh.chen.poseidon.services;

import com.haochh.chen.poseidon.bean.Result;
import com.haochh.chen.poseidon.bean.User;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2019/5/19.
 */
@Service
public interface UserServices {

    public Result add(User user);

    public Result exists(User  user);

    public User findOneByName(User user);

}
