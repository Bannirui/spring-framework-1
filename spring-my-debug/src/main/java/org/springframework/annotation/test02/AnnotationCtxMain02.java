package org.springframework.annotation.test02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @since 2022/12/5
 * @author dingrui
 */
public class AnnotationCtxMain02 {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(MyCfg02.class);
	}
}
