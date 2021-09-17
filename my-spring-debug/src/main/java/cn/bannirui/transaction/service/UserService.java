package cn.bannirui.transaction.service;

import cn.bannirui.transaction.entity.User;

/**
 * @author dingrui
 * @date 2021/9/17
 * @description
 */
public interface UserService {

	User queryById(Long id);

	void updateNameById();

	void testTransactional();
}
