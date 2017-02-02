package global;

import java.awt.image.BufferStrategy;


import gameMode.StartScreen;

public abstract class GameManager {

	public static GameStart gameStart = new GameStart();
	public static BufferStrategy bufferStrate;
	static byte gameModeId;
	static Object gameMode = new StartScreen(); // 1 = StartScreen
	
	static void gameIterate() {
		
		if (gameModeId == 1) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			((StartScreen) gameMode).update();
			((StartScreen) gameMode).render();
			
			
		}
		
		
		
		
		
		
	}
	
	public static void createBufferStrategy(int numBuffer){
		
		gameStart.createBufferStrategy(numBuffer);
		
		
	}
	
	public static int getWidth(){
		
		return gameStart.getWidth();
		
		
	}
	
	public static int getHeight(){
		
		return gameStart.getHeight();
		
		
	}
	
	

public static void main (String[] args){
	System.out.println("wat");
	gameModeId = 1;
	gameStart = new GameStart ();
	
	gameStart.start();
		
			

		
	}

}
	
	
	
