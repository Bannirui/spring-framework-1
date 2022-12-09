package org.springframework.bean_factory_postprocessor.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @since 2022/12/7
 * @author dingrui
 */
@Component
public class MyBean01 {

	public MyBean01() {
		System.out.println("MyBean01构造方法");
	}
}
