package cn.bannirui.importannotation.config;

import cn.bannirui.importannotation.service.impl.HelloServiceImpl;
import cn.bannirui.importannotation.service.impl.MyServiceImpl2;
import cn.bannirui.importannotation.service.impl.MyServiceImpl3;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author dingrui
 * @date 2021/9/16
 * @description
 */
@Configuration
/**
 * @Import的使用方式
 *   - @Import可以直接把类放入到Spring中 但是这样的方式只能使用类的无参构造方法来创建Bean 对于有参的构造方法就无能为力了
 *   - @Import配合ImportBeanDefinitionRegistrar接口的实现使用 相较于普通的方式灵活很多
 *   - @Import配合ImportSelector接口的实现使用 最优雅
 */
@Import(value = {HelloServiceImpl.class, MyServiceImpl2.class, MyServiceImpl3.class})
public class Config {
}
