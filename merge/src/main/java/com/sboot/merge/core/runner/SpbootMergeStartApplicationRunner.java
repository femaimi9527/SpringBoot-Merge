package com.sboot.merge.core.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * SpringBoot启动后执行任务
 */

@Component
@Order(1)
public class SpbootMergeStartApplicationRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("##############################系统启动完成##############################");
        System.out.println("#                                                                     #");
        System.out.println("#######################################################################");
    }
}
