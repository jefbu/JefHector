package gameMode;

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
		
		System.out.println("Ele chegou aqui");
		
		Screen.eraseScreen();
		
		bufferStrategy = GameManager.bufferStrate;
		if (bufferStrategy == null) {
			System.out.println("bs is null");
			GameManager.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bufferStrategy.getDrawGraphics();
		
		for (int i = 0; i < worldMapLevel.tiles.length; i++) {
			worldMapLevel.tiles[i].render(0, 0, screen);
			System.out.println(i);
		}
		
		g.drawImage(background, 0, 0, null);
		g.dispose();

		bufferStrategy.show();
			
	}
	
	
	


}
