package cn.bannirui.ioc.annotation.bean;

import org.springframework.stereotype.Repository;

/**
 * @author dingrui
 * @date 2021/9/13
 * @description
 */
@Repository
public class Hello {

	public void sayHello() {
		System.out.println("hello...");
	}
}
