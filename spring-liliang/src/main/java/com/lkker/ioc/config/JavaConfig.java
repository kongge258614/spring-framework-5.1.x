package com.lkker.ioc.config;

import com.lkker.ioc.model.Logistics;
import com.lkker.ioc.service.impl.LkkerService;
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
@Import(value = LkkerService.class)
public class JavaConfig {

	@Bean
	public Logistics logistics(){
		return new Logistics();
	}
	

}
