package com.lkker.aop;

import com.lkker.aop.config.JavaConfigOfAOP;
import com.lkker.aop.service.MathCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liliang
 * @Date 2019/9/1 11:17
 * @Description
 **/
public class TestAOP {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigOfAOP.class);

		MathCalculator mathCalculator = (MathCalculator) applicationContext.getBean("mathCalculator");

		mathCalculator.div(6,2);

	}
}
