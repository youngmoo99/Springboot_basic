package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component //스프링이 관리하는 컴포넌트 
//스프링이 pacmangame 인스턴스를 자동으로 만들어줌
public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}
}
