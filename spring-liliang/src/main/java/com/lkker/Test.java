package com.lkker;

import com.lkker.config.JavaConfig;
import com.lkker.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liliang
 * @Date 2019/8/9 21:52
 * @Description
 **/
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(JavaConfig.class);

		Object bean = atx.getBean("userServiceImpl", UserService.class);

		System.out.println("beanName:"+bean.getClass().getName());
	}
}
