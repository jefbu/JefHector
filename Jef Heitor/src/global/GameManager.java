package global;

import java.awt.Frame;
import java.awt.image.BufferStrategy;

import gameMode.GameMode;
import gameMode.StartScreen;

public abstract class GameManager {

	public static GameStart gameStart = new GameStart();
	public static BufferStrategy bufferStrate;
	static byte gameModeId = 0;
	static GameMode gameMode = new StartScreen(); // 0 = StartScreen
	
	static void gameIterate() {
		
		if (gameModeId == 2) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			gameMode.update();
			gameMode.render();
			
			
		}
		
		else if (gameModeId == 0) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			gameMode.update();
			gameMode.render();
			
			
		}
		
		
		
		
		
		
	}
	
	public static void setGameModeId (byte id){
		
		gameModeId = id;
		
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
	
	public static Frame getFrame(){
		
		return gameStart.frame;
	}
	
	

public static void main (String[] args){

	System.out.println("Main start");

	gameStart.start();
		
			

		
	}

}
	
	
	
