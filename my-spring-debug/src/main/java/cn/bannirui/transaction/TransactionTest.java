package cn.bannirui.transaction;

import cn.bannirui.transaction.config.JdbcConfig;
import cn.bannirui.transaction.entity.User;
import cn.bannirui.transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/17
 * @description @EnableTransactionManagement注解
 */
public class TransactionTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JdbcConfig.class);
		UserService userService = ac.getBean(UserService.class);
		// 业务逻辑-查询
		System.out.println(userService.queryById(1L));
		// 业务逻辑-修改
		userService.updateNameById();
		System.out.println(userService.queryById(1L));
		// 事务
		userService.testTransactional();
		System.out.println(userService.queryById(1L));
	}
}
