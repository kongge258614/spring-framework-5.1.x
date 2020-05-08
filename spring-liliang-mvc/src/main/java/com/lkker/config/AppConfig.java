package com.lkker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(value = {"com.lkker"},includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {RestController.class, Controller.class})
},useDefaultFilters = false)
@EnableWebMvc
public class AppConfig  implements WebMvcConfigurer{

	/**
	 * 配置拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LkkerInterceptor lkkerInterceptor = new LkkerInterceptor();
		registry.addInterceptor(lkkerInterceptor).addPathPatterns("/**");
	}


}
