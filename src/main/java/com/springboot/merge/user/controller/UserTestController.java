package com.springboot.merge.user.controller;

import com.springboot.merge.user.dto.UserTest;
import com.springboot.merge.user.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserTestController
 * @description
 * @author hellozhaoxudong@163.com
 * @date 19-3-31 下午3:36
 * @version 1.0
 * @since JDK 1.8
 */

@RestController
@RequestMapping("")
public class UserTestController {

    @Autowired
    private UserTestService service;

    @GetMapping(value = "/user/test/info/query", produces="application/json")
    public List<UserTest> queryUserTestInfo(){

        return service.queryUserTestInfo();
    }

    @GetMapping(value = "/user/test/info/test", produces="application/json")
    public String Test(){

        return "hello";
    }
}
