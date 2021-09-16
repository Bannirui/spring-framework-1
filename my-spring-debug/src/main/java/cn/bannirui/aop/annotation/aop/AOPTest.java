package cn.bannirui.aop.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
@Aspect
@Component
public class AOPTest {

	@Pointcut("execution(public * cn.bannirui.aop.annotation.service.HelloService.sayHello(..))")
	public void testAOP() {

	}

	@Before("testAOP()")
	public void before() {
		System.out.println("before testAOP...");
	}

	@After("testAOP()")
	public void after() {
		System.out.println("after testAOP...");
	}

	@Around("testAOP()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("around before testAOP...");
		Object o = null;
		try {
			o = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around after testAOP...");
		return o;
	}
}
