package org.springframework.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class AnnotationCtxMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean1 myBean1 = ctx.getBean(MyBean1.class);
		Long id = myBean1.getId();
		System.out.println();
	}
}
