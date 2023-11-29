package com.in28minutes.learnspringframework.examples.a0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class 어노테이션정리 {

	public static void main(String[] args) {
		//1. @Configuration 
		// 클래스가 1개 이상의 @Bean 메소드를 선언하고 스프링 컨테이너로 처리되어 빈 정의를 생성한다는 것을 나타냄
		//즉 자바 설정 파일을 생성한다는 뜻
			
		//2. @ComponentScan
		// 특정 패키지를 정의하여 컴포넌트를 스캔할 수 있음
		// 컴포넌트를 스캔할 수 있는 패키지를 지정할 수 있음 따로 지정하면 현재 패키지 스캔
		
		//3. @Component
		// 어노테이션된 클래스가 component라는 것을 나타냄 
		
		//4. @Service 
		//@Component의 한 종류로 어노테이션된 클래스가 비즈니스 로직을 가지고 있따는 것을 나타냄 
		
		//5. @Controller
		// @Component의 한 종류로 어노테이션된 클래스가 Controller 임을 나타냄 
		// ex) 웹 컨트롤러 -> 대체로 웹 애플리케이션과 REST API에서 컨트롤러를 정의하는데 쓰임 
		
		//6. @Repository
		// @Component의 한 종류로 어노테이션된 클래스가 데이터베이스에서 데이터 검색 또는 데이터 조작에 쓰인다는것을 가리킴

		//7. @Primary
		//여러 호부가 단일 값 의존성을 자동 와이어링할 자격이 있는경우 BEAN에 우선권을 부여해야 한다는 사실을 나타냄 
		
		//8. @Qualifier
		// 자동와어어링 시 후보빈에 대한 Qualifier로서 필드 또는 매개변수에서 쓰임 
		//primary와 달리 구체적이며 모든 컴포넌트에 추가할 수있음
		
		//9. @Lazy
		//일반적으로 스프링 빈은 이른시기에 초기화되는데, 초기화를 지연해야하는 경우 @Lazy어노테이션을 활용함 
		
		//10. @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) -- 프로토타입 유효 범위 
		// 빈을 참조할떄마다 새로운 인스턴스 생성됨 
		
		//11. @PostConstruct
		// 의존성 주입이 완료되어 초기화가 수행된 후 실행되는 메소드를 식별 
		// 결국 초기화를 수행해야되는 경우 모든 의존성이 빈으로 주입됨 
		//데이터베이스에서값을 몇개 검색하는 경우, 모든 의존성이 준비되자마자 @postconstruce 어노테이션 사용가능 
		
		//12. @PreDestroy
		// 콜백알림을 수신하는 메소드를 식별 
		// 이 콜백알림은 인스턴스가 컨테이너에 의해 제거되고 있다는 신호룰 알려주는것
		// 일반적으로 특정 빈이 보유하고 있는 리소스를 해제하는 데 사용 
		
		
	}

}
