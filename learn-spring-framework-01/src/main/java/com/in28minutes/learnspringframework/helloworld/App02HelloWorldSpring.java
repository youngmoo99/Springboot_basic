package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a Spring Context 
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			//2. Configure the things that we want Spring to manage -  configuration 클래스 
			String myname = (String) context.getBean("name"); // 메서드이름 
			
			System.out.println(myname);
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			//System.out.println(context.getBean(Address.class)); 
			
			
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			
			//System.out.println
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //모든 빈 이름이 출력 
			
			
			
		}
		
	
		
	}

}
