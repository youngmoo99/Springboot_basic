package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {}; // record는 getter setter 안써도됨 
record Address (String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	@Bean
	public int age() {
		return 25;
	}
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20, new Address("Japan", "Osaka"));
		//person.age();
		
		return person;
	}
	
	@Bean(name = "address2")
	public Address address() {
		var myaddress = new Address("Korea", "Jangyu");
		//person.age();
		
		return myaddress;
	}
	@Bean(name = "address3")
	public Address address3() {
		var myaddress = new Address("USA", "New York");
		//person.age();
		
		return myaddress;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name,age, address3); //메서드 가져오지않고 매개변수 사용
	}
	
	
}
