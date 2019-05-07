package com.spboot.merge.user.mapper;

import com.spboot.merge.activi.dto.Activi;
import com.spboot.merge.user.dto.SysUser;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @ClassName SysUserMapper
 * @description 用户信息Mapper
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 16:14
 * @version 1.0
 * @since JDK 1.8
 */
public interface SysUserMapper extends Mapper<SysUser>, InsertListMapper<SysUser> {


}
