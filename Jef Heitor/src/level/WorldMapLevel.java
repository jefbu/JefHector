package level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import graphics.tileCollection.TileCollection;
import graphics.tiles.Tile;

public class WorldMapLevel extends Level {
	
	private int[] levelPixels;
	
	public WorldMapLevel () {
		
		super();
		
	}
	
public void loadLevel(String path){
	
	try {
		BufferedImage worldMapImage = ImageIO.read(WorldMapLevel.class.getResource(path));
		int w = worldMapImage.getWidth();
		int h = worldMapImage.getHeight();
		tiles = new Tile[w * h ];
		levelPixels = new int[w * h];
		worldMapImage.getRGB(0, 0, w, h, levelPixels, 0, w); 
		
		generateLevel();
	}
	
	catch (IOException e) {
		e.printStackTrace();
		System.out.println("Error at WORLDMAP image");
	}
		
		
	}

public void generateLevel() {
	
	for (int i = 0; i < levelPixels.length; i++) {
		if (levelPixels[i] == 0xff00FF00) {
			tiles[i] = TileCollection.grassTile;
		}
		if (levelPixels[i] == 0xffff0000) {
			tiles[i] = TileCollection.voidTile;
		}
		
	}
	
}




}
