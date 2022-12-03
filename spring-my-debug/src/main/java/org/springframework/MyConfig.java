package org.springframework;

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
		return new MyBean1();
	}
}

class MyBean1 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
