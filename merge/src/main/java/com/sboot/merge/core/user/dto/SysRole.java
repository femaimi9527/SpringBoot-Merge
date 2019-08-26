package com.sboot.merge.core.user.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName SysRole
 * @description 角色信息实体
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 15:57
 * @version 1.0
 * @since JDK 1.8
 */
@Data
@TableName("SYS_ROLE")
public class SysRole {
    /** 角色ID **/
    @TableId
    private Long roleId;

    /** 角色编码 **/
    @TableField
    private String roleCode;

    /** 角色名称 **/
    @TableField
    private String roleName;
}
