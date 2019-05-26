package com.haochh.chen.poseidon.controller;

import com.haochh.chen.poseidon.bean.Result;
import com.haochh.chen.poseidon.bean.User;
import com.haochh.chen.poseidon.repository.UserRepository;
import com.haochh.chen.poseidon.services.UserServices;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

/**
 * Created by admin on 2019/5/18.
 */
@RestController
@RequestMapping("/demo")
@JsonComponent
public class MainController {

    @Autowired
    private UserServices userServices;

    private static Logger log = Logger.getLogger("MainController.class");


    @GetMapping(path = "add")
    public @ResponseBody
    Result addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String passwd) {
        Result result;
        User n = new User(name, email, passwd);
        result = userServices.add(n);
        log.info(result.toString());
        return result;
    }

    @GetMapping(path = "exists")
    public @ResponseBody
    Result existsUser(@RequestParam String name, @RequestParam String passwd) {
        Result result;
        User n = new User(name, "", passwd);
        result = userServices.exists(n);
        log.info(result.toString());
        return result;
    }

    @GetMapping(path = "existsByName")
    public @ResponseBody
    Result existsUserByNmae(@RequestParam String name) {
        Result result;
        User n = new User(name, "", "");
        result =userServices.findOneByName(n);
        log.info(result.toString());
        return result;
    }
}
