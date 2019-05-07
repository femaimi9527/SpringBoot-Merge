package com.spboot.merge.core.util;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @ClassName ContextUtil
 * @description 当前环境工具类
 * @author hellozhaoxudong@163.com
 * @date 2019/5/6 16:12
 * @version 1.0
 * @since JDK 1.8
 */
public class ContextUtil {

    /**
     * currentUserName : 获取当前登录用户名
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/6 16:21
     * @param
     * @return java.lang.String
     * @since JDK 1.8
     */
    public static String currentUserName(){
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        return userName;
    }
}
