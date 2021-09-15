package cn.bannirui.ioc.annotation;

import cn.bannirui.ioc.annotation.bean.Hello;
import cn.bannirui.ioc.annotation.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/13
 * @description
 */
public class IOCAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Hello bean = ac.getBean(Hello.class);
		bean.sayHello();
	}
}
