package com.spboot.merge.user.service;

import com.spboot.merge.core.exception.BaseException;
import com.spboot.merge.user.dto.SysUserRole;
import com.spboot.merge.user.mapper.SysUserRoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysUserRoleService
 * @description 用户角色关联信息逻辑处理层
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 16:38
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class SysUserRoleService {

    private final static Logger logger = LoggerFactory.getLogger(SysUserRoleService.class);

    @Autowired
    private SysUserRoleMapper mapper;

    /**
     * querySysUserRoleByUserId : 根据用户id查询角色信息
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/4/28 16:56
     * @param userId
     * @return java.util.List<com.spboot.merge.user.dto.SysUserRole>
     * @since JDK 1.8
     */
    public List<SysUserRole> querySysUserRoleByUserId(Long userId){
        List<SysUserRole> list = mapper.querySysUserRoleByUserId(userId);
        if(null == list || list.size() < 1){
            throw new BaseException("用户下无任何角色！请联系开发者");
        }

        return list;
    }


}
