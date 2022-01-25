package cn.bannirui.transaction.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author dingrui
 * @date 2021/9/17
 * @description
 */
@Configuration
@ComponentScan("cn.bannirui.transaction")
/**
 * 事务的实现是通过开启@EnableTransactionMangement注解实现的
 */
@EnableTransactionManagement
public class JdbcConfig {

	@Bean
	public DruidDataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("19920308");
		druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=false");
		return druidDataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(this.druidDataSource());
	}

	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(this.druidDataSource());
	}
}
