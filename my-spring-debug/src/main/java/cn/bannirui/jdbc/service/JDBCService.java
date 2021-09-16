package cn.bannirui.jdbc.service;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
public interface JDBCService {

	void queryById(Long id);

	void updateNameById(Long id, String name);
}
