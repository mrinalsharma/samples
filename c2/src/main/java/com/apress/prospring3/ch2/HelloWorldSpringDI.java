package com.apress.prospring3.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/spring/app-context.xml");
		MessageRender mr = context
				.getBean("render", MessageRender.class);
		
		mr.render();
	}

}
