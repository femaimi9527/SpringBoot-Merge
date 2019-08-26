package com.sboot.merge.core.security;


import com.sboot.merge.core.user.dto.SysUser;
import com.sboot.merge.core.user.dto.SysUserRole;
import com.sboot.merge.core.user.service.SysUserRoleService;
import com.sboot.merge.core.user.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserDetailsServiceImpl
 * @description
 * @author xudong.zhao@hand-china.com
 * @date 2019/5/7 15:43
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final static Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysUserRoleService sysUserRoleService;


    /**
     * loadUserByUsername : 获取用户信息(用户名，密码，角色集)
     *
     * 返回UserDetails，这是一个接口，通常返回它的字类org.springframework.security.core.userdetails.User
     * User的构造需要三个参数：用户名，密码，角色集
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/4/29 14:36
     * @return org.springframework.security.core.userdetails.UserDetails
     * @since JDK 1.8
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("[用户]: " + username + " ······ [信息]: 用户登录" + " ······ [内容]: 用户尝试登录");


        // 用户信息
        SysUser sysUser = sysUserService.loadUserByUsername(username);

        // 角色信息
        List<SysUserRole> sysUserRoleList = sysUserRoleService.querySysUserRoleByUserId(sysUser.getUserId());

        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        SimpleGrantedAuthority simpleGrantedAuthority;
        for(SysUserRole sysUserRole : sysUserRoleList){
            simpleGrantedAuthority = new SimpleGrantedAuthority(sysUserRole.getRoleCode());
            authorities.add(simpleGrantedAuthority);
        }

        return new User(sysUser.getUsername(), sysUser.getPassword(), authorities);
    }
}
