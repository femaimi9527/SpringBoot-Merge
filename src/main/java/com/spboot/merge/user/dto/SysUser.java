package com.spboot.merge.user.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName SysUser
 * @description 用户信息实体
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 15:50
 * @version 1.0
 * @since JDK 1.8
 */
@Table(name = "sys_user")
public class SysUser {
    /** 用户ID **/
    @Id
    private Long userId;

    /** 登录名 **/
    @Column
    private String username;

    /** 密码 **/
    @Column
    private String password;

    /** 用户真实姓名 **/
    @Column
    private String userRealName;

    /** 手机号 **/
    @Column
    private String phone;

    /** 邮箱 **/
    @Column
    private String email;

    /** 信用值 **/
    @Column
    private Long credit;


    /** getter & setter **/
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }
}
