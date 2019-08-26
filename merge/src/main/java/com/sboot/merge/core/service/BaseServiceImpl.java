package com.sboot.merge.core.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @ClassName BaseServiceImpl
 * @description
 * @author hellozhaoxudong@163.com
 * @date 2019/8/23 22:59
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T>{

    public List<T> selectAll(){
        return this.baseMapper.selectList(null);
    }

    public List<T> selectList(Wrapper<T> queryWrapper){
        return this.baseMapper.selectList(queryWrapper);
    }


}
