package com.spboot.merge.user.mapper;

import com.spboot.merge.user.dto.SysUser;
import com.spboot.merge.user.dto.SysUserRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

import java.util.List;

/**
 * @ClassName SysUserRoleMapper
 * @description 用户角色信息Mapper
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 16:36
 * @version 1.0
 * @since JDK 1.8
 */
public interface SysUserRoleMapper extends Mapper<SysUserRole>, InsertListMapper<SysUserRole> {

    /**
     * querySysUserRoleByUserId : 根据用户id查询角色信息
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/4/28 16:51
     * @param userId 用户ID
     * @return java.util.List<com.spboot.merge.user.dto.SysUserRole>
     * @since JDK 1.8
     */
    List<SysUserRole> querySysUserRoleByUserId(@Param("userId") Long userId);

}
