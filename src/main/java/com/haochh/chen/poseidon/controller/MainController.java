package com.haochh.chen.poseidon.controller;

import com.haochh.chen.poseidon.bean.Result;
import com.haochh.chen.poseidon.bean.User;
import com.haochh.chen.poseidon.repository.UserRepository;
import com.haochh.chen.poseidon.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2019/5/18.
 */
@RestController
@RequestMapping("/demo")
@JsonComponent
public class MainController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "add")
    public @ResponseBody
    Result addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String passwd) {

        User n = new User(name, email, passwd);

        return userServices.add(n);
    }


    @GetMapping(path = "exists")
    public @ResponseBody
    Result existsUser(@RequestParam String name, @RequestParam String passwd) {
        User n = new User(name, "", passwd);
        return userServices.exists(n);
    }

    @GetMapping(path = "existsByName")
    public @ResponseBody
    User existsUserByNmae(@RequestParam String name) {
        User n = new User(name, "", "");
        System.out.println("******");
        return userServices.findOneByName(n);
    }

}
