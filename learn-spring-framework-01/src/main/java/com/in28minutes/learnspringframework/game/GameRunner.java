package com.in28minutes.learnspringframework.game;

public class GameRunner {
	//MarioGame game;
	private GamingConsole game;
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		
		System.out.println("게임 실행 : "+ game);
		
		game.up();
		game.left();
		game.right();
		game.down();
	}
}
