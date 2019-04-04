package com.springboot.merge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MergeApplication
 * @description 启动类
 * @author hellozhaoxudong@163.com
 * @date 19-3-31 下午2:30
 * @version 1.0
 * @since JDK 1.8
 */
@SpringBootApplication
@MapperScan("com.springboot.merge.*.mapper")   //扫描Mapper接口,mapper接口添加@Mapper注解同此行的效果，选一即可
public class MergeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MergeApplication.class, args);
    }

}
