package com.lkker.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author liliang
 * @Date 2019/9/1 10:42
 * @Description  @Aspect:表示当前类是切面类
 **/
@Component
@Aspect
public class LogAspects {

	// 抽取公共的切入点表达式
	@Pointcut("execution(public int com.lkker.aop.service.MathCalculator.*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println(methodName+"运行之前.........参数列表是:"+ Arrays.asList(args));
	}

	@After("pointCut()")
	public void logEnd(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println(methodName+"运行结束...........");
	}

	@AfterReturning(value = "pointCut()",returning = "result")
	public void logReturn(Object result){
		System.out.println("除法正常返回........运行结果是:"+result);
	}

	@AfterThrowing(value = "pointCut()",throwing = "exception")
	public void logException(JoinPoint joinPoint,Exception exception){
		String methodName=joinPoint.getSignature().getName();
		System.out.println(methodName+"除法异常..........异常信息:"+exception);
	}

}
