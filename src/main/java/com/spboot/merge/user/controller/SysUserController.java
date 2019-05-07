package com.spboot.merge.user.controller;

import com.spboot.merge.core.exception.BaseException;
import com.spboot.merge.core.reponseDate.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SysUserController
 * @description 用户设置接口
 * @author hellozhaoxudong@163.com
 * @date 2019/5/6 16:32
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
public class SysUserController {

    /**
     * loginError : 登录失败：密码错误
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/6 16:36
     * @return com.spboot.merge.core.reponseDate.ResponseData
     * @since JDK 1.8
     */
    @RequestMapping("/login/error")
    public ResponseData loginError(){
        throw new BaseException("密码错误!");
    }

}
