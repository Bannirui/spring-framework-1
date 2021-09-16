package cn.bannirui.aop.annotation;

import cn.bannirui.aop.annotation.config.AppConfig;
import cn.bannirui.aop.annotation.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public class AOPAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ac.getBean(HelloService.class);
		String s = helloService.sayHello();
		System.out.println(s);
	}
}
