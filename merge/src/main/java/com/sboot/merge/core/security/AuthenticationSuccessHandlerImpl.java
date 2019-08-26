package com.sboot.merge.core.security;

import com.sboot.merge.core.exception.BaseException;
import com.sboot.merge.core.reponseDate.ResponseData;
import com.sboot.merge.core.user.dto.SysUser;
import com.sboot.merge.core.user.dto.SysUserRole;
import com.sboot.merge.core.user.service.SysUserRoleService;
import com.sboot.merge.core.user.service.SysUserService;
import com.sboot.merge.core.util.ContextUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @ClassName AuthenticationSuccessHandlerImpl
 * @description 用于处理认证成功后的逻辑
 * 用户登录认证成功后会调用此逻辑,注意需要删除config中的http.formLogin().defaultSuccessUrl("/")
 *
 * 即用户登录认证成功后返回基本信息即可,不采用指定跳转页面的方式,也符合前后端分离项目中Restful接口风格
 *
 * @author hellozhaoxudong@163.com
 * @date 2019/5/28 17:22
 * @version 1.0
 * @since JDK 1.8
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    private final static Logger logger = LoggerFactory.getLogger(AuthenticationSuccessHandlerImpl.class);

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        String username = ((UserDetails)authentication.getPrincipal()).getUsername();
        //用户信息
        SysUser sysUser = sysUserService.loadUserByUsername(username);
        // 角色信息
        List<SysUserRole> sysUserRoleList = sysUserRoleService.querySysUserRoleByUserId(sysUser.getUserId());

        try{
            sysUser.setSysUserRoles(sysUserRoleList);
            sysUser.setPassword(null);
            ContextUtils.setSessionAttribute(httpServletRequest, "sysUser", sysUser);
        }catch (Exception e){
            throw new BaseException("更新session失败!");
        }

        //返回用户信息
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json; charset=utf-8");
        JSONObject responseJSONObject = JSONObject.fromObject(new ResponseData(sysUser));
        PrintWriter out = null ;
        try{
            out = httpServletResponse.getWriter();
            out.append(responseJSONObject.toString());
        } catch (Exception e){
            throw new BaseException("登录返回数据渲染失败，请重试！");
        }

        logger.info("[用户]: " + ContextUtils.currentUserName(httpServletRequest) + " ······ [信息]: 用户登录成功" + " ······ [内容]: 认证信息,"+ authentication  +",登录地址," + ContextUtils.getHttpRequestIpAddress(httpServletRequest));
    }
}
