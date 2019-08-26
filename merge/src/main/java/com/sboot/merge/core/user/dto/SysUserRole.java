package com.sboot.merge.core.user.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName SysUserRole
 * @description 用户角色实体
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 16:00
 * @version 1.0
 * @since JDK 1.8
 */
@Data
@TableName("SYS_USER_ROLE")
public class SysUserRole {
    /** 用户角色信息ID **/
    @TableId
    private Long userRoleId;

    /** 用户ID **/
    @TableField
    private Long userId;

    /** 角色ID **/
    @TableField
    private Long roleId;


    /** 角色编码 **/
    @TableField
    private String roleCode;

    /** 角色名称 **/
    @TableField
    private String roleName;
}
