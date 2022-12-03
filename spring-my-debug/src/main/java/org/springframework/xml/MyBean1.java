package org.springframework.xml;

/**
 *
 * @since 2022/12/3
 * @author dingrui
 */
public class MyBean1 {
	private String name;

	public MyBean1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
