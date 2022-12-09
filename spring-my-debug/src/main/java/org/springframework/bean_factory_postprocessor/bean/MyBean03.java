package org.springframework.bean_factory_postprocessor.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 * @since 2022/12/9
 * @author dingrui
 */
public class MyBean03 implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{MyBean04.class.getName()};
	}
}
