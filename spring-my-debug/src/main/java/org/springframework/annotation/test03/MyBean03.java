package org.springframework.annotation.test03;

import org.springframework.stereotype.Component;

/**
 *
 * @since 2022/12/6
 * @author dingrui
 */
@Component
public class MyBean03 {

	public MyBean03() {
		System.out.println("MyBean03构造方法");
	}
}
