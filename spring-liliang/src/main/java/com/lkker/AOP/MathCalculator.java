package com.lkker.AOP;

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


}
