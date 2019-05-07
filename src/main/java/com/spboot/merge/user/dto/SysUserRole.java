package com.spboot.merge.user.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @ClassName SysUserRole
 * @description 用户角色实体
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 16:00
 * @version 1.0
 * @since JDK 1.8
 */
@Table(name = "sys_user_role")
public class SysUserRole {
    /** 用户角色信息ID **/
    @Id
    private Long userRoleId;

    /** 用户ID **/
    @Column
    private Long userId;

    /** 角色ID **/
    @Column
    private Long roleId;


    /** 角色编码 **/
    @Transient
    private String roleCode;

    /** 角色名称 **/
    @Transient
    private String roleName;



    /** setter & getter **/
    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
