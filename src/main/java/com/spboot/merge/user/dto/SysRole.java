package com.spboot.merge.user.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName SysRole
 * @description 角色信息实体
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 15:57
 * @version 1.0
 * @since JDK 1.8
 */
@Table(name = "sys_role")
public class SysRole {
    /** 角色ID **/
    @Id
    private Long roleId;

    /** 角色编码 **/
    @Column
    private String roleCode;

    /** 角色名称 **/
    @Column
    private String roleName;


    /** setter & getter **/
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
