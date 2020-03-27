package com.lkker.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


/**
 * 类的描述：IOC 根容器，不扫描Controller的注解
 */
@Configuration
@ComponentScan(basePackages = {"com.lkker.mvc"},excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {RestController.class, Controller.class}),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = AppConfig.class)
})
public class RootConfig {
}
