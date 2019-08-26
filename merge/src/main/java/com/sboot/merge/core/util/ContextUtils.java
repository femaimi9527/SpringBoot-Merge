package com.sboot.merge.core.util;

import com.sboot.merge.core.user.dto.SysUser;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName ContextUtil
 * @description 当前环境工具类
 * @author hellozhaoxudong@163.com
 * @date 2019/5/6 16:12
 * @version 1.0
 * @since JDK 1.8
 */
public class ContextUtils {

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
    public static String currentUserName(HttpServletRequest request){
        SysUser sysUser = (SysUser)getSessionAttribute(request, "sysUser");

        return sysUser.getUserRealName();
    }

    /**
     * getSessionId : 获取SessionId
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/29 17:25
     * @param
     * @return java.lang.String
     * @since JDK 1.8
     */
    public static String getSessionId(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        return session.getId();
    }

    /**
     * setSessionAttribute : 设置sessiond的值
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/6/5 10:14
     * @param request
     * @param sessionKey
     * @param sessionValue
     * @return void
     * @since JDK 1.8
     */
    public static void setSessionAttribute(HttpServletRequest request,String sessionKey, Object sessionValue){
        HttpSession session = request.getSession();
        session.setAttribute(sessionKey, sessionValue);
    }

    /**
     * setSessionAttribute : 获取sessiond的值
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/6/5 10:14
     * @param request
     * @param sessionKey
     * @return void
     * @since JDK 1.8
     */
    public static Object getSessionAttribute(HttpServletRequest request,String sessionKey){
        HttpSession session = request.getSession();
        return session.getAttribute(sessionKey);
    }

    /**
     * setSessionAttribute : 删除sessiond的值
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/6/5 10:14
     * @param request
     * @param sessionKey
     * @return void
     * @since JDK 1.8
     */
    public static void removeSessionAttribute(HttpServletRequest request,String sessionKey) {
        HttpSession session = request.getSession();
        session.removeAttribute(sessionKey);
    }

        /**
         * getHttpRequestIpAddress : 获取请求来源IP地址
         *
         * @author hellozhaoxudong@163.com
         * @version 1.0
         * @date 2019/5/28 17:36
         * @param request 请求
         * @return java.lang.String
         * @since JDK 1.8
         */
    public static String getHttpRequestIpAddress(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
