package level;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import graphics.tileCollection.TileCollection;
import graphics.tiles.Tile;

public class WorldMapLevelTest {
	
	WorldMapLevel worldMapLevel;
	
	@Before
	public void initialise() {
		worldMapLevel = new WorldMapLevel();
	}

	@Test
	public void generateLevelTest() {

		int[] testLevelPixels = new int[2];
		testLevelPixels[0] = 0xff00FF00;
		testLevelPixels[1] = 0xffFF0000;
		
		Tile[] tiles = new Tile[2];
		
		worldMapLevel.generateLevel(testLevelPixels, tiles);
		
		assertEquals(tiles[0], TileCollection.grassTile);
		assertEquals(tiles[1], TileCollection.voidTile);
		
	}
	
	@Test
	public void loadLevelTest() {
		
		worldMapLevel.loadLevel("/testImage.png");
		
		assertEquals(worldMapLevel.levelPixels.length, 64);
		assertEquals(worldMapLevel.levelPixels[0], 0xff000000);
		assertEquals(worldMapLevel.levelPixels[4], 0xffFF0000);
		
	}

}
