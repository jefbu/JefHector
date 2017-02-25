package global;

import java.awt.Frame;
import java.awt.image.BufferStrategy;

import gameMode.GameMode;
import gameMode.StartScreen;
import gameMode.WorldMap;

public abstract class GameManager {

	public static GameStart gameStart = new GameStart();
	public static BufferStrategy bufferStrate;
	static byte gameModeId = 0;
	static GameMode gameMode0 = new StartScreen(); // 0 = StartScreen
	static GameMode gameMode1 = new WorldMap(); 
	
	static void gameIterate() {
		
		if (gameModeId == 1) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			gameMode1.update();
			gameMode1.render();
			
			
		}
		
		else if (gameModeId == 0) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			gameMode0.update();
			gameMode0.render();
			
			
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

	gameStart = new GameStart ();
	
	gameStart.start();
		
			

		
	}

}
	
	
	
