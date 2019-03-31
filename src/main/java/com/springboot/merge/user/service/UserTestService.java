package com.springboot.merge.user.service;

import com.springboot.merge.user.dto.UserTest;
import com.springboot.merge.user.mapper.UserTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserTestService
 * @description
 * @author hellozhaoxudong@163.com
 * @date 19-3-31 下午3:31
 * @version 1.0
 * @since JDK 1.8
 */

@Service
public class UserTestService {

    @Autowired
    private UserTestMapper mapper;

    public List<UserTest> queryUserTestInfo(){
        return mapper.userTestInfo();
    }
}
