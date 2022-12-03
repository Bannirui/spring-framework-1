package org.springframework.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
@Configuration
public class MyConfig {

	@Bean
	public MyBean1 myBean1() {
		return new MyBean1(2L);
	}
}
