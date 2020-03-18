/*package com.lkker.ioc.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		BeanDefinition beanDefinition = (BeanDefinition) bean;  // 问题出在这一步，JavaConfig类属于增强类，不属于BeanDefinition！！！
		if (beanDefinition.getBeanClassName().contains("logisticsServiceImpl")){
			beanDefinition.setScope("singleton");
			return beanDefinition;

		}
		return null;
	}
}*/

/*
Caused by: java.lang.ClassCastException: com.lkker.ioc.config.JavaConfig$$EnhancerBySpringCGLIB$$7e41916f cannot be cast to org.springframework.beans.factory.config.BeanDefinition
总结：如果要在对象实例化之前修改bean的属性，需要实现BeanFactoryPostProcessor，因为实现BeanFactoryPostProcessor接口后可以获得beanfactory，拿到beanfactory后可以根据名称获取到beandefinition，
然后对beanDefinition进行修改。

*/
