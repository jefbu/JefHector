package level;

import global.GameManager;
import global.Screen;
import graphics.tileCollection.TileCollection;
import graphics.tiles.Tile;

public class Level {
	boolean x = false;
	protected Tile[] tiles;
	
	
	public Level() {
		
	}
	
	public Level(String path){
		
		loadLevel(path);
	}
	
	private void loadLevel(String path){
		
		
	}
	
	public void render (int xScroll, int yScroll, Screen screen){
		
		screen.setOffsets(xScroll, yScroll);
		int x0 = xScroll >> 5;
		int x1 = (xScroll + GameManager.getWidth()) >> 3;
		int y0 = yScroll >> 5;
		int y1 = (yScroll + GameManager.getHeight()) >> 3;
		
		for(int y = y0; y < y1; y++){
			
			for(int x = x0; x < x1; x++){
				
				getTile(x, y).render(x, y, screen);
			}
		}
	}
	
	public Tile getTile (int x, int y){
		if(this.x == false){
			this.x = true;
			return TileCollection.grassTile;
		}
		this.x = false;
		return TileCollection.voidTile;
		
	}

}
