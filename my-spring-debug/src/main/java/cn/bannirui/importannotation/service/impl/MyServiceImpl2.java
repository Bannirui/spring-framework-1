package cn.bannirui.importannotation.service.impl;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public class MyServiceImpl2 implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder bd = BeanDefinitionBuilder.rootBeanDefinition(HelloServiceImpl2.class);
		registry.registerBeanDefinition(HelloServiceImpl2.class.getName(), bd.getBeanDefinition());
	}
}
