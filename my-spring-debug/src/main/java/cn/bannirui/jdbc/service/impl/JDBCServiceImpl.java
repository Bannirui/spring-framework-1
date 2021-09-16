package cn.bannirui.jdbc.service.impl;

import cn.bannirui.jdbc.entity.User;
import cn.bannirui.jdbc.mapper.UserRowMapper;
import cn.bannirui.jdbc.service.JDBCService;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public class JDBCServiceImpl implements JDBCService {

	private JdbcTemplate jdbcTemplate;

	public JDBCServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void queryById(Long id) {
		List<User> users = this.jdbcTemplate.query(
				"select id, name, age from user where id=?",
				new Object[]{id},
				new UserRowMapper()
		);
		users.forEach(o -> {
			System.out.println(o.getId() + "-" + o.getName() + "-" + o.getAge());
		});
	}

	@Override
	public void updateNameById(Long id, String name) {
		this.jdbcTemplate.update(
				"update user set name=? where id=?",
				new Object[]{name, id},
				new UserRowMapper()
		);
	}
}
