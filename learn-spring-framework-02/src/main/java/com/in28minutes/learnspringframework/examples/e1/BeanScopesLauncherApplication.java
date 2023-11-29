package com.in28minutes.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Component
class NormalClass {
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 프로토타입 패턴 
@Component
class PrototypeClass {
	

}


@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
	

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
			//getbean 노말클래스는 프로토타입이 아니라 인스턴스고정 
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			//getbean 호출할때마다 프로토타입은 새로운 해시코드를 줌 -> 인스턴스를 새로줌 
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			
			
		}
		

	}

}
