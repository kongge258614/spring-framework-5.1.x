package com.lkker;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;

public class ApplicationStarter {

	public static void main(String[] args) throws Exception {

		// 内置tomcat
		Tomcat tomcat=new Tomcat();
		tomcat.setPort(8080);
		Context context=tomcat.addContext("/",System.getProperty("java.io.tmpdir"));
		// 注册listener
		context.addLifecycleListener((LifecycleListener)Class.forName(tomcat.getHost().getConfigClass()).newInstance());
		tomcat.start();
		tomcat.getServer().await();
	}
}
