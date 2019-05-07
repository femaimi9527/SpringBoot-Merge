package com.spboot.merge.user.controller;

import com.spboot.merge.core.reponseDate.ResponseData;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.util.List;

/**
 * @ClassName SecurityTestController
 * @description spring security 权限测试
 * @author hellozhaoxudong@163.com
 * @date 2019/5/6 11:50
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/")
public class SecurityTestController {

    /**
     * baseTest : Spring Security 基础测试：未登录时访问该接口应该自动转到login.html，登录后访问该接口应返回“springsecurity”
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/6 15:02
     * @return java.lang.String
     * @since JDK 1.8
     */
    @GetMapping(value = "securitytest/basetest")
    public String baseTest(){
        return "spring security";
    }

    /**
     * adminSecurityTest :  API测试：未登录时访问该接口应该自动转到login.html，非管理员角色登录后应提示403权限不足，管理员登录后应返回“api测试：admin”
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/6 15:11
     * @return java.lang.String
     * @since JDK 1.8
     */
    @GetMapping(value = "admin/securitytest")
    public String adminSecurityTest(){
        return "api测试：admin";
    }

}
