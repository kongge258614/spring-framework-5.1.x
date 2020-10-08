/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;

/**
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 * 允许自定义的修改应用程序上下文的bean的定义。调整上下文的内部 bean factory的bean属性值。
 * 实现此接口可以获取到整个bean factory，可以对bean factory做任意修改。权限相当大。
 *
 * <p>Application contexts can auto-detect BeanFactoryPostProcessor beans in
 * their bean definitions and apply them before any other beans get created.
 *	应用程序上下文可以自动检测实现了 BeanFactoryPostProcessor 接口的bean，
 *	并且在其他bean被创建之前应用这些BeanFactoryPostProcessor.
 *
 * <p>Useful for custom config files targeted at system administrators that
 * override bean properties configured in the application context.
 *
 * <p>See PropertyResourceConfigurer and its concrete implementations
 * for out-of-the-box solutions that address such configuration needs.
 *
 * <p>A BeanFactoryPostProcessor may interact with and modify bean
 * definitions, but never bean instances. Doing so may cause premature bean
 * instantiation, violating the container and causing unintended side-effects.
 * If bean instance interaction is required, consider implementing
 * {@link BeanPostProcessor} instead.
 *	BeanFactoryPostProcessor可以修改bean的 BeanDefinition,但是不能修改bean的实例。
 * spring的扩展点之一，spring允许BeanFactoryPostProcessor在容器实例化任何其他bean之前读取配置元数据，并可以根据需要进行修改。
 * 例如可以把bean的scope从singleton改为prototype，也可以修改property的值。
 *
 * @author Juergen Hoeller
 * @since 06.07.2003
 * @see BeanPostProcessor
 * @see PropertyResourceConfigurer
 */
@FunctionalInterface
public interface BeanFactoryPostProcessor {

	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * 在应用程序上下文的标准初始化之后修改其内部bean工厂。所有bean定义都将被加载，
	 * 但还没有实例化bean。这样就可以覆盖或添加属性，甚至可以对渴望初始化的bean进行覆盖或添加。
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws org.springframework.beans.BeansException in case of errors
	 */
	void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
