package org.springframework.liliang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 类的描述：IOC 根容器，不扫描Controller的注解
 */
@Configuration
@ComponentScan(basePackages = {"org.springframework.liliang"},excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {RestController.class, Controller.class}),
		@ComponentScan.Filter()
})
public class RootConfig {
}
