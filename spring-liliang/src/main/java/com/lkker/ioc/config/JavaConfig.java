package com.lkker.ioc.config;

import com.lkker.ioc.model.Logistics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liliang
 * @Date 2019/8/9 21:52
 * @Description
 **/

@Configuration
@ComponentScan("com.lkker.ioc")
public class JavaConfig {

	@Bean
	public Logistics getLogistics(){
		return new Logistics();
	}
	

}
