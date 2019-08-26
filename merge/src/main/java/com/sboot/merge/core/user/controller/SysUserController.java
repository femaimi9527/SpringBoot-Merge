package com.sboot.merge.core.user.controller;

import com.sboot.merge.core.exception.BaseException;
import com.sboot.merge.core.reponseDate.ResponseData;
import com.sboot.merge.core.user.dto.SysUser;
import com.sboot.merge.core.user.service.SysUserService;
import com.sboot.merge.core.util.ContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName SysUserController
 * @description 用户设置接口
 * @author hellozhaoxudong@163.com
 * @date 2019/5/6 16:32
 * @version 1.0
 * @since JDK 1.8
 */

@RestController
@RequestMapping("/api")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * loginError : 登录失败：密码错误
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/6 16:36
     * @return com.spboot.merge.core.reponseDate.ResponseData
     * @since JDK 1.8
     */
    @RequestMapping("/login/error")
    public ResponseData loginError(){
        throw new BaseException("用户名或密码错误!");
    }

    /**
     * notLogin : 未登录
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/6/13 10:55
     * @param httpServletResponse
     * @return com.spboot.merge.core.reponseDate.ResponseData
     * @since JDK 1.8
     */
    @GetMapping("/not/login")
    public ResponseData notLogin(HttpServletResponse httpServletResponse){

        throw new BaseException("未登录");
    }

}
