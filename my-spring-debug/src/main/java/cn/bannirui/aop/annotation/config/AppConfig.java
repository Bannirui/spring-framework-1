package cn.bannirui.aop.annotation.config;

import cn.bannirui.aop.annotation.service.HelloService;
import cn.bannirui.aop.annotation.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
// 使用注解开启AOP功能
@EnableAspectJAutoProxy
@Configuration
@ComponentScan("cn.bannirui.aop.annotation")
public class AppConfig {

	@Bean
	public HelloService helloService() {
		return new HelloServiceImpl();
	}
}
