package org.springframework.annotation.test00;

import org.springframework.stereotype.Component;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
@Component
public class MyBean00 {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
