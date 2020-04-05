package com.lkker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(value = {"com.lkker"},includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {RestController.class, Controller.class})
},useDefaultFilters = false)
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

	/**
	 * 配置拦截器
	 */


//	/**
//	 * 配置文件上传下载的组件
//	 * @return
//	 */
//	@Bean
//	public MultipartResolver multipartResolver(){
//		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//		multipartResolver.setDefaultEncoding("UTF-8");
//		multipartResolver.setMaxUploadSize(1024*1024*10);
//		return multipartResolver;
//	}
//
//	/**
//	 * 配置视图解析器
//	 * @return
//	 */
//	@Bean
//	public InternalResourceViewResolver internalResourceViewResolver(){
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/jsp");
//		resolver.setSuffix(".jsp");
//		return resolver;
//
//	}
//
//	/**
//	 * 重写消息转换器
//	 * @param converters initially an empty list of converters
//	 */
//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		converters.add(new MappingJackson2HttpMessageConverter());
//	}
}
