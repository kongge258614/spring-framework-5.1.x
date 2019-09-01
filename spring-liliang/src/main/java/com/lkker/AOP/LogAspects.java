package com.lkker.AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author liliang
 * @Date 2019/9/1 10:42
 * @Description  @Aspect:表示当前类是切面类
 **/
@Component
@Aspect
public class LogAspects {

	// 抽取公共的切入点表达式
	@Pointcut("execution(public int com.lkker.AOP.MathCalculator.*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void logStart(){
		System.out.println("除法运行之前.........参数列表是{}");
	}

	@After("pointCut()")
	public void logEnd(){
		System.out.println("除法运行结束...........");
	}

	@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("除法正常返回........运行结果是{}");
	}

	@AfterThrowing("pointCut()")
	public void logException(){
		System.out.println("除法异常..........");
	}

}
