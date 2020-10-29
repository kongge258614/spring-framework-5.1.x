package com.lkker.ioc.config;

import com.lkker.ioc.model.Logistics;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author liliang
 * @Date 2019/8/9 21:52
 * @Description
 **/

@Configuration
@ComponentScan("com.lkker.ioc")
@Import(value = LaiyueBeanDefinitionRegistryPostProcessor.class)
public class JavaConfig {

	@Bean(autowire = Autowire.BY_TYPE)
	public Logistics logistics(){
		return new Logistics();
	}
	

}
