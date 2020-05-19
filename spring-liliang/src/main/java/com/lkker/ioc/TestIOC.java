package com.lkker.ioc;

import com.lkker.ioc.config.JavaConfig;
import com.lkker.ioc.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liliang
 * @Date 2019/8/9 21:52
 * @Description
 **/
public class TestIOC {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(JavaConfig.class);

		UserService bean = (UserService) atx.getBean("userService");

		bean.save();


	}
}
