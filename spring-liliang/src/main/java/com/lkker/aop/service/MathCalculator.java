package com.lkker.aop.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @Author liliang
 * @Date 2019/9/1 10:38
 * @Description
 **/
@Component
public class MathCalculator {

	// 相除
	public int div(int i,int j){
		System.out.println("div方法执行中......");
		return i/j;
	}

	// 计算
	public int calculate(int i,int j){
		System.out.println("calculate...............");
/*		MathCalculator mathCalculator = (MathCalculator) AopContext.currentProxy();
		int div = mathCalculator.div(i, j);*/

		int div = this.div(i, j);
		return div;

	}


}
