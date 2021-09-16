package cn.bannirui.jdbc;

import cn.bannirui.jdbc.config.JDBCConfig;
import cn.bannirui.jdbc.service.JDBCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public class JdbcTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JDBCConfig.class);
		JDBCService jdbcService = ac.getBean(JDBCService.class);
		jdbcService.queryById(1L);
		System.out.println();
	}
}
