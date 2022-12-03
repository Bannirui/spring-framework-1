package org.springframework.annotation;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class MyBean1 {

	private Long id = 1L;

	public MyBean1(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
