package com.lkker;

import com.lkker.AOP.MathCalculator;
import com.lkker.config.JavaConfigOfAOP;
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

		mathCalculator.div(6,3);

	}
}
