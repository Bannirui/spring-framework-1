package org.springframework.annotation.test02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @since 2022/12/5
 * @author dingrui
 */
@Configuration
public class MyCfg02 {

	@Bean
	public MyBean02 myBean02() {
		return new MyBean02();
	}
}
