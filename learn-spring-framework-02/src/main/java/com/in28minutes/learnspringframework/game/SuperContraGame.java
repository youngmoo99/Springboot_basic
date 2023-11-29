package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //primary가 먼저 실행 
@Qualifier("SuperContraGameQualifier") //gamerunner에서 @Qualifier("SuperContraGameQualifier")로 지정하면 콘트라게임이 실행됨 

//primary랑 qualifier를 어떤 상황에 쓰는게 더 좋냐? 
// ex) primary는 만약 다섯개의 빈이 있고 어떤 빈하나가 필요한경우 그럴때 부여하면된다 
// ex) qualifier는 자동 와이어링될 특정 빈에 부여 아주 특징적인 어떤 빈을 사용할때 쓰는 속성 

public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("Sit down");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Shoot a bullet");
	}
}
