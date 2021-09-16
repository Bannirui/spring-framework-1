package cn.bannirui.importannotation;

import cn.bannirui.importannotation.config.Config;
import cn.bannirui.importannotation.service.HelloService;
import cn.bannirui.importannotation.service.impl.HelloServiceImpl;
import cn.bannirui.importannotation.service.impl.HelloServiceImpl2;
import cn.bannirui.importannotation.service.impl.HelloServiceImpl3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public class ImportTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		HelloService helloService = ac.getBean(HelloService.class);
		HelloServiceImpl2 helloServiceImpl2 = ac.getBean(HelloServiceImpl2.class);
		HelloServiceImpl3 helloServiceImpl3 = ac.getBean(HelloServiceImpl3.class);
		System.out.println(helloService);
		System.out.println(helloServiceImpl2);
		System.out.println(helloServiceImpl3);
	}
}
