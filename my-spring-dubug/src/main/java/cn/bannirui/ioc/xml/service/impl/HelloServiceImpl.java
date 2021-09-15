package cn.bannirui.ioc.xml.service.impl;

import cn.bannirui.ioc.xml.service.HelloService;

/**
 * @author dingrui
 * @date 2021/9/14
 * @description
 */
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello() {
		return "hello, ioc";
	}
}
