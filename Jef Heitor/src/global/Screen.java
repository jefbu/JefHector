package global;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import gameMode.StartScreen;
import graphics.tiles.Tile;

public class Screen {

	public static BufferStrategy bufferStrategy;
	public static BufferedImage background = new BufferedImage(GameManager.getWidth(), GameManager.getHeight(),
			BufferedImage.TYPE_INT_RGB);
	public static int[] pixelLocation = ((DataBufferInt) background.getRaster().getDataBuffer()).getData();
	private static int[] pixels;
	private int xOffset, yOffset;

	public Screen() {
		
	}
	

	public static void render(int width, int height) {
		

		attributeArray();
		bufferStrategy = GameManager.bufferStrate;
		if (bufferStrategy == null) {
			System.out.println("bs is null");
			GameManager.createBufferStrategy(3);
			return;
		}

		Graphics g = bufferStrategy.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GameManager.getWidth(), GameManager.getHeight());
		g.drawImage(background, 0, 0, null);
		g.dispose();
		bufferStrategy.show();



	}

	public static void eraseScreen() {

		for (int i = 0; i < pixelLocation.length; i++) {
			
			pixelLocation[i] = 0;
		}

	}


	public static void attributeArray() {

		for (int i = 0; i < pixels.length; i++) {

			pixelLocation[i] = pixels[i];
		}
	}
	
	public void renderTile (int xp, int yp, Tile tile){
		

		xp -= xOffset;
		yp -= yOffset;
		
		for(int y = 0; y < tile.sprite.getSIZEH() ;y++){
			
			int ya = y + yp;
			
			for(int x = 0; x < tile.sprite.getSIZEW(); x++){
				
				int xa = x + xp;
				
				if (xa < 0 || xa >= GameManager.getWidth() || ya <0 || ya>= GameManager.getHeight()){
					break;
				}
					
					StartScreen.pixelLocation[xa + ya * GameManager.getWidth()] = tile.sprite.getPixels()[x + y * tile.sprite.getSIZEW()];
				
			}
			
		}
	}
	
	public void setOffsets(int xOffset, int yOffset){
		
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	

}
