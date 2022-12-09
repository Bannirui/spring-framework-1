package org.springframework.annotation.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @since 2022/12/6
 * @author dingrui
 */
public class AnnotationCtxMain04 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyCfg04.class);
		ctx.getBean(MyBean04.class);
	}
}
