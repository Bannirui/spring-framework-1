package org.springframework.annotation.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.xml.MyBean1;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class AnnotationCtxMain01 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig01.class);
		MyBean01 myBean01 = ctx.getBean(MyBean01.class);
		Long id = myBean01.getId();
		System.out.println();
	}
}
