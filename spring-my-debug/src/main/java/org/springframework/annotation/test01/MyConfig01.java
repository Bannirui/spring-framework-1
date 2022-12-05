package org.springframework.annotation.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.xml.MyBean1;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
@Configuration
public class MyConfig01 {

	@Bean
	public MyBean01 myBean01() {
		return new MyBean01(2L);
	}
}
