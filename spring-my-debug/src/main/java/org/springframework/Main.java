package org.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ${END}
 * @since ${DATE}
 * @author ${USER}
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean1 myBean1 = ctx.getBean(MyBean1.class);
		String name = myBean1.getName();
		System.out.println(name);
	}
}