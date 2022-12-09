package org.springframework.bean_factory_postprocessor;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

/**
 *
 * @since 2022/12/6
 * @author dingrui
 */
public class MyTest00 {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		beanFactory.registerBeanDefinition("myCfg00", new RootBeanDefinition(MyCfg00.class));
		ConfigurationClassPostProcessor postProcessor = new ConfigurationClassPostProcessor();
		postProcessor.postProcessBeanDefinitionRegistry(beanFactory);
		System.out.println();
	}
}
