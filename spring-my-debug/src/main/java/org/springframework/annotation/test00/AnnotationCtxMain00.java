package org.springframework.annotation.test00;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class AnnotationCtxMain00 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("org.springframework.annotation.test00");
		MyBean00 bean = ctx.getBean(MyBean00.class);
		Long id = bean.getId();
		System.out.println();
	}
}
