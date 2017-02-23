package global;

import java.awt.image.BufferStrategy;

import gameMode.StartScreen;
import gameMode.WorldMap;

public abstract class GameManager {

	public static GameStart gameStart = new GameStart();
	public static BufferStrategy bufferStrate;
	static byte gameModeId;
	static Object gameMode99 = new StartScreen(); // 99 = StartScreen
	static Object gameMode1 = new WorldMap(); // 1 = WorldMap
	
	static void gameIterate() {
		
		if (gameModeId == 1) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			((WorldMap) gameMode1).update();
			((WorldMap) gameMode1).render();
			
			
		}
		
		if (gameModeId == 99) {
			
			bufferStrate = gameStart.getBufferStrategy();
			
			((StartScreen) gameMode99).update();
			((StartScreen) gameMode99).render();
			
			
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

	gameModeId = 1;
	gameStart = new GameStart ();
	
	gameStart.start();
		
			

		
	}

}
	
	
	
