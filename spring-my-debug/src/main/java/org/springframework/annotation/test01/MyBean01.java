package org.springframework.annotation.test01;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class MyBean01 {

	private Long id = 1L;

	public MyBean01(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
