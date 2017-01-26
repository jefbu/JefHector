package graphics.tileCollection;

import graphics.spriteCollection.VoidT;
import graphics.spriteCollection.WorldMap;
import graphics.tiles.GrassTile;
import graphics.tiles.Tile;
import graphics.tiles.VoidTile;

public class TileCollection {
	
	public static Tile grassTile = new GrassTile (WorldMap.grass);
	public static Tile voidTile = new VoidTile (VoidT.voidSprite);

}
