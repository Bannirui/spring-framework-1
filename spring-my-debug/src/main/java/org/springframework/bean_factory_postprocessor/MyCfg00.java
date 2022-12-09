package org.springframework.bean_factory_postprocessor;

import org.springframework.bean_factory_postprocessor.bean.MyBean00;
import org.springframework.bean_factory_postprocessor.bean.MyBean02;
import org.springframework.bean_factory_postprocessor.bean.MyBean03;
import org.springframework.bean_factory_postprocessor.bean.MyBean05;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

/**
 *
 * @since 2022/12/6
 * @author dingrui
 */
@Configuration
// @PropertySource("classpath:a.properties")
// @PropertySource("classpath:b.properties")
// @PropertySources(value = {
// 		@PropertySource("classpath:a.properties"),
		// @PropertySource("classpath:b.properties")
// })
// @ComponentScan(value = "org.springframework.bean_factory_postprocessor.bean")
// @Import(MyBean02.class)
// @Import(MyBean03.class)
// @Import(MyBean05.class)
@ImportResource({"classpath:a.properties"})
public class MyCfg00 {

	public MyCfg00() {
		System.out.println("MyCfg00构造方法");
	}

	@Bean
	public MyBean00 myBean00() {
		return null;
	}

	// @Configuration
	// class MyCfgInner {
	//
	// }
}