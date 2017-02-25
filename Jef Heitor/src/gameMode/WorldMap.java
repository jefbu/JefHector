package gameMode;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import global.GameManager;
import global.Screen;
import level.WorldMapLevel;

public class WorldMap implements GameMode{
	
	WorldMapLevel worldMapLevel = new WorldMapLevel("path");
	Screen screen = new Screen();

	public static BufferStrategy bufferStrategy;
	public static BufferedImage background = new BufferedImage(GameManager.getWidth(), GameManager.getHeight(),
			BufferedImage.TYPE_INT_RGB);
	public static int[] pixelLocation = ((DataBufferInt) background.getRaster().getDataBuffer()).getData();
	//private static int[] pixels;
	//private int xOffset, yOffset;
	/*private BufferStrategy bufferStrategy;
	private BufferedImage background = new BufferedImage(GameManager.getWidth(), GameManager.getHeight(), BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt)background.getRaster().getDataBuffer()).getData();*/
	
	
	
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

		worldMapLevel.loadLevel("/graphics/levels/w.png");
		g.drawImage(background, 0, 0, null);
		g.dispose();

		bufferStrategy.show();
		
		
		
		//Screen.render(GameManager.getWidth(),GameManager.getHeight() );
		/*bufferStrategy = GameManager.bufferStrate;
		if(bufferStrategy == null){
			System.out.println("bs is null");
			GameManager.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bufferStrategy.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GameManager.getWidth(), GameManager.getHeight());
		g.dispose();
		bufferStrategy.show();*/
		
		
	}
	
	
	


}
