package com.springboot.merge.user.mapper;

import com.springboot.merge.user.dto.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserTestMapper {

    List<UserTest> userTestInfo();
}
