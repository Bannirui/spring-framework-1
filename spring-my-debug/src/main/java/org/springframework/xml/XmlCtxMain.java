package org.springframework.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class XmlCtxMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		MyBean1 myBean1 = ctx.getBean(MyBean1.class);
		String name = myBean1.getName();
		System.out.println();
	}
}
