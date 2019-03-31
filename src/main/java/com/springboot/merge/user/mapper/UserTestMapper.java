package com.springboot.merge.user.mapper;

import com.springboot.merge.user.dto.UserTest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTestMapper {

    List<UserTest> userTestInfo();
}
