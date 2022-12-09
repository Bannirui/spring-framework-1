package org.springframework.annotation.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @since 2022/12/6
 * @author dingrui
 */
public class AnnotationCtxMain03 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyCfg03.class);
	}
}
