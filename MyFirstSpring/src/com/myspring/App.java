package com.myspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
//		System.out.println("HI");
		
		HelloWorld obj = context.getBean("mybean",HelloWorld.class);
		System.out.println(obj.getMsg());
		context.close();
	}

}
