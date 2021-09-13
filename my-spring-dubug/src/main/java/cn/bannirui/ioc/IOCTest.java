package cn.bannirui.ioc;

import cn.bannirui.ioc.bean.Hello;
import cn.bannirui.ioc.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/13
 * @description
 */
public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Hello bean = ac.getBean(Hello.class);
		bean.sayHello();
	}
}
