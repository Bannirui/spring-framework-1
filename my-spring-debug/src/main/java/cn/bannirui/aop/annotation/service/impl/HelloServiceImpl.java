package cn.bannirui.aop.annotation.service.impl;

import cn.bannirui.aop.annotation.service.HelloService;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello() {
		return "hello...annotation aop";
	}
}
