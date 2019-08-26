package com.sboot.merge.core.runner;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ApplicationContextInitializer是在ConfigurableApplicationContext刷新之前初始化Spring ConfigurableApplicationContext的回调接口。
 * 当执行：ConfigurableApplicationContext.refresh()或SpringApplication.run()时生效。
 *
 * 需要在application.yml中以context.initializer.classes为key配置一个或多个自定义Initializer
 */
public class ApplicationContextInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        System.out.println("#######################系统启动############################");

    }
}
