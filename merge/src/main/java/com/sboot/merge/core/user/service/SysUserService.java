package com.sboot.merge.core.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sboot.merge.core.exception.BaseException;
import com.sboot.merge.core.service.BaseServiceImpl;
import com.sboot.merge.core.user.dto.SysUser;
import com.sboot.merge.core.user.mapper.SysUserMapper;
import com.sboot.merge.core.util.ContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName SysUserService
 * @description 用户信息逻辑层
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 16:14
 * @version 1.0
 * @since JDK 1.8
 */
@Service
@Transactional
public class SysUserService extends BaseServiceImpl<SysUserMapper, SysUser> {

    private final static Logger logger = LoggerFactory.getLogger(SysUserService.class);

    @Autowired
    private SysUserMapper mapper;

    /**
     * loadUserByUsername : 根据用户名查询用户信息
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/4/28 16:21
     * @param username
     * @return java.util.List<com.spboot.merge.user.dto.SysUser>
     * @since JDK 1.8
     */
    public SysUser loadUserByUsername(String username){
        List<SysUser> sysUserList = selectList(new QueryWrapper<SysUser>().eq("USERNAME", username));

        if(null == sysUserList || sysUserList.size() == 0){
            throw new BaseException("用户名不存在！");
        }else if(sysUserList.size() > 1){
            throw new BaseException("用户名存在冲突！请联系开发者！");
        }

        return sysUserList.get(0);
    }

}
