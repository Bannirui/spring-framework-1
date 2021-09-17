package cn.bannirui.transaction.service.impl;

import cn.bannirui.jdbc.mapper.UserRowMapper;
import cn.bannirui.transaction.entity.User;
import cn.bannirui.transaction.mapper.UserMapper;
import cn.bannirui.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dingrui
 * @date 2021/9/17
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryById(Long id) {
		List<User> users = this.jdbcTemplate.query(
				"select id, name, age from user where id=?",
				new Object[]{id},
				this.userMapper
		);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public void updateNameById() {
		this.jdbcTemplate.update(
				"update user set name='lixiao' where id=1",
				new Object[]{}
		);
	}

	@Override
	public void testTransactional() {
		this.jdbcTemplate.update(
				"update user set name='zhangsan' where id=1",
				new Object[]{}
		);
		throw new RuntimeException("异常");
	}
}
