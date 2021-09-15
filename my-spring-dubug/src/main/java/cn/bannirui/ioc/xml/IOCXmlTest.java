package cn.bannirui.ioc.xml;

import cn.bannirui.ioc.xml.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/14
 * @description
 */
public class IOCXmlTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-ioc-xml.xml");
		HelloService helloService = ac.getBean(HelloService.class);
		String s = helloService.sayHello();
		System.out.println(s);
	}
}
