package cn.bannirui.jdbc.config;

import cn.bannirui.jdbc.JdbcTest;
import cn.bannirui.jdbc.service.JDBCService;
import cn.bannirui.jdbc.service.impl.JDBCServiceImpl;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
@Configuration
@ComponentScan("cn.bannirui.jdbc")
public class JDBCConfig {

	@Bean
	public DruidDataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("19920308");
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=false");
		return druidDataSource;
	}

	@Bean
	public JDBCService jdbcService(@Autowired DruidDataSource druidDataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(druidDataSource);
		return new JDBCServiceImpl(jdbcTemplate);
	}
}
