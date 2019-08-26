package com.sboot.merge.core.user.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.List;

/**
 * @ClassName SysUser
 * @description 用户信息实体
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 15:50
 * @version 1.0
 * @since JDK 1.8
 */
@Data
@TableName("SYS_USER")
public class SysUser {
    /** 用户ID **/
    @TableId
    private Long userId;

    /** 登录名 **/
    @TableField
    private String username;

    /** 密码 **/
    @TableField
    private String password;

    /** 用户真实姓名 **/
    @TableField
    private String userRealName;

    /** 手机号 **/
    @TableField
    private String phone;

    /** 邮箱 **/
    @TableField
    private String email;

    /** 信用值 **/
    @TableField
    private Long credit;

    /** 用户权限集合  **/
    @TableField(exist = false)
    private List<SysUserRole> sysUserRoles;

    /** 新密码  **/
    @TableField(exist = false)
    private String newPassword;

}
