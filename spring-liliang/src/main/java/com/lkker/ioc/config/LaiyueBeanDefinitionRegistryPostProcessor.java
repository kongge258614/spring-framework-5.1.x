package com.lkker.ioc.config;

import com.lkker.ioc.model.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Author liliang
 * @Date 2020/10/29 9:58
 * @Description
 **/
public class LaiyueBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(User.class);
		registry.registerBeanDefinition("user",rootBeanDefinition);

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("自定义BeanDefinitionRegistryPostProcessor..........................");
	}
}
