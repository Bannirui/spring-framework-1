package org.springframework.bean_factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 *
 * @since 2022/12/9
 * @author dingrui
 */
public class BeanFactoryMain00 {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		RootBeanDefinition beanDefinition = new RootBeanDefinition(MyBean00.class);
		beanFactory.registerBeanDefinition("myBean00",beanDefinition);
		MyBean00 ret = (MyBean00) beanFactory.getBean("myBean00");
		System.out.println();
	}
}
