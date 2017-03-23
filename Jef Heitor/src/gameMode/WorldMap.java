package gameMode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import global.GameManager;
import global.Screen;
import level.WorldMapLevel;

public class WorldMap implements GameMode{
	
	WorldMapLevel worldMapLevel = new WorldMapLevel();
	Screen screen = new Screen();

	public static BufferStrategy bufferStrategy;
	public static BufferedImage background = new BufferedImage(GameManager.getWidth(), GameManager.getHeight(),
			BufferedImage.TYPE_INT_RGB);
	public static int[] pixelLocation = ((DataBufferInt) background.getRaster().getDataBuffer()).getData();
	
	public WorldMap() {
		
		worldMapLevel.loadLevel("/graphics/levels/w.png");
		
	}
	
	
	public void update() {
		
		if(GameManager.gameStart.im.up == true){
			
		}
		
		
	}
	
	
	public void render() {
				
		Screen.eraseScreen();
		
		bufferStrategy = GameManager.bufferStrate;
		if (bufferStrategy == null) {
			System.out.println("bs is null");
			GameManager.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bufferStrategy.getDrawGraphics();
		
		int x1 = GameManager.getWidth() + 32 >> 5;
		int y1 = GameManager.getHeight() + 32 >> 5;

		
		for (int y = 0; y < y1 ; y++) {
			for (int x = 0; x < x1; x++) {
			worldMapLevel.tiles[x + y].render(x, y, screen);
			}
		}
		
		g.drawImage(background, 0, 0, null);
		g.dispose();

		bufferStrategy.show();
			
	}
	
	
	


}
