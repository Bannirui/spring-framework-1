package org.springframework.annotation.test04;

import org.springframework.context.annotation.Bean;

/**
 *
 * @since 2022/12/6
 * @author dingrui
 */
public class MyCfg04 {

	@Bean
	public MyBean04 myBean04(){
		return new MyBean04();
	}
}
