package com.sboot.merge.core.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName AuthenticationFailureHandlerImpl
 * @description 用于处理认证失败后的逻辑
 * 用户登录认证失败后会调用此逻辑,注意需要删除config中的http.formLogin().failureUrl("/")
 *
 * 即用户登录认证失败后返回基本信息即可,不采用指定跳转页面的方式,也符合前后端分离项目中Restful接口风格
 *
 * @author hellozhaoxudong@163.com
 * @date 2019/5/28 17:53
 * @version 1.0
 * @since JDK 1.8
 */
@Component
public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

    private final static Logger logger = LoggerFactory.getLogger(AuthenticationFailureHandlerImpl.class);

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        //throw new BaseException("登录失败");
    }
}
