package org.springframework.annotation.test02;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 * @since 2022/12/5
 * @author dingrui
 */
public class MyCfg02 {

	@Bean
	public MyBean02 myBean02() {
		return new MyBean02();
	}
}
