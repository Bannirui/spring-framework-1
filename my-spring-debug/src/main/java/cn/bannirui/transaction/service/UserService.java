package cn.bannirui.transaction.service;

import cn.bannirui.transaction.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dingrui
 * @since 2022/1/25
 * @description
 */
public interface UserService {
	User queryById(Long id);

	void updateNameById();

	void testTransactional(int[] arr);
}
