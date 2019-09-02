package com.lkker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author liliang
 * @Date 2019/9/1 10:36
 * @Description
 * 1.导入aop模块：Spring AOP(Spring-aspects)
 * 2.定义一个业务逻辑模块(MathCalculator);在业务逻辑运行时，打印日志(方法执行之前、方法执行之后....)
 * 3.定义一个日志切面类(LogAspects),切面类里面的方法需要动态感知div运行到哪里，然后进行执行。
 * 		日志切面类里面的方法称之为通知方法，通知方法包括:
 * 		前置通知(@Before): logStart,在目标方法(div)执行之前执行
 * 		后置通知(@After): logEnd,在目标方法(div)执行之后执行
 * 		返回通知(@AfterReturning): logReturn,在目标方法(div)正常返回之后执行
 * 		异常通知(@AfterThrowing): logException,在目标方法(div)出现异常时执行
 * 		环绕通知(): 动态代理，手动推进目标方法运行(joinPoint.procced())
 * 4.给切面类的目标方法标注何时何地运行(通知注解)
 * 5.将切面类和业务逻辑类(目标方法所在类)都加入到容器中
 * 6.必须告诉Spring，哪个类是切面类，即在切面类上加上@Aspect注解
 * 7.给配置类加上@EnableAspectJAutoProxy，开启基于注解的aop模式
 *
 * 把握住三步：
 * 			1.将业务逻辑和切面类添加到容器中，告诉spring哪个是切面类(@Aspect)
 * 			2.在切面类上，每个通知方法上标注通知注解，告诉spring何时何地的运行（切入点表达式）
 * 			3.开启基于注解的aop模式(@EnableAspectJAutoProxy)
 *
 * AOP原理：[看给容器注册了什么组件，这个组件什么时候工作，这个组件的功能是什么]
 * 		1.@EnableAspectJAutoProxy是什么？
 * 			@Import(AspectJAutoProxyRegistrar.class), 给容器中导入	AspectJAutoProxyRegistrar.class
 * 			利用AspectJAutoProxyRegistrar给容器中注册bean
 *
 *
 *
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lkker")
public class JavaConfigOfAOP {

}
