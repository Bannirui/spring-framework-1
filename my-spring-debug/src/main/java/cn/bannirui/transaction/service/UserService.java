package cn.bannirui.transaction.service;

import cn.bannirui.transaction.entity.User;
import cn.bannirui.transaction.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @author dingrui
 * @date 2021/9/17
 * @description
 */
@Service
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserMapper userMapper;

	public User queryById(Long id) {
		List<User> users = this.jdbcTemplate.query(
				"select id, name, age from user where id=?",
				new Object[]{id},
				this.userMapper
		);
		return users.isEmpty() ? null : users.get(0);
	}

	public void updateNameById() {
		this.jdbcTemplate.update(
				"update user set name='lixiao' where id=1",
				new Object[]{}
		);
	}

	@Transactional(rollbackFor = Exception.class)
	public void testTransactional(int[] arr) {
		Arrays.fill(arr, -1);
		this.jdbcTemplate.update(
				"update user set name='zhangSan' where id=1",
				new Object[]{}
		);
		throw new RuntimeException("异常");
	}
}
