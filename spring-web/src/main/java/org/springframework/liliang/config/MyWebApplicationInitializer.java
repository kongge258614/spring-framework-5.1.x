package org.springframework.liliang.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class MyWebApplicationInitializer extends AbstractDispatcherServletInitializer {
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[0];
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}
}
