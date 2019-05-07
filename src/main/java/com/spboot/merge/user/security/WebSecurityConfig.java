package com.spboot.merge.user.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName WebSecurityConfig
 * @description Spring Security 配置类
 * @author hellozhaoxudong@163.com
 * @date 2019/4/29 16:59
 * @version 1.0
 * @since JDK 1.8
 */

@Configuration  // 标识该类为配置类
@EnableWebSecurity  // 开启Spring Security服务
@EnableGlobalMethodSecurity(prePostEnabled = true)  // 开启全局Spring Security注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // 指定用户，角色信息加载及密码加密方式，将默认的userDetailsService替换成我们自己实现的UserDetailsServiceImpl
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
            .passwordEncoder(new PasswordEncoder() {
                @Override
                public String encode(CharSequence charSequence) {
                    return charSequence.toString();
                }

                @Override
                public boolean matches(CharSequence charSequence, String s) {
                    return s.equals(charSequence.toString());
                }
            });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 配置拦截规则
        http.authorizeRequests()
                .antMatchers("/login.html","/api/login", "/visitor/**").permitAll()
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                .anyRequest().authenticated();

        // 配置登录相关信息
        http.formLogin()
                .loginPage("/login.html")   // 指定登录页面
                .loginProcessingUrl("/api/login")   // 指定登录url(默认为/login，此处和表单的action要一致)
                .usernameParameter("username")  // 指定登录用户名参数名称(默认为username)
                .passwordParameter("password")  // 指定密码参数名称(默认为password)
                .defaultSuccessUrl("/")  // 指定登录成功后跳转页

                .failureUrl("/api/login/error") // 指定登录失败URL,可在该接口中抛出异常。(默认为/login?error)
                .permitAll();

        // 配置注销相关信息
        http.logout()
                .logoutUrl("/api/loginout") // 指定注销URL(默认为/login)
                .permitAll();

        // 关闭CSRF跨域
        http.csrf().disable();
    }

    // 配置对资源文件放行
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**");
    }
}
