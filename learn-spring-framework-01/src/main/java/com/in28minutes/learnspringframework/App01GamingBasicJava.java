package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game= new MarioGame();
//		var game = new SuperContraGame();
		
		var game = new PacmanGame(); // 오브젝트 생성 
		var gameRunner = new GameRunner(game); // 의존성 와이어링
			
		gameRunner.run();

	}

}
