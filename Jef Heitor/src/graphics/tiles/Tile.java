package graphics.tiles;

import global.Screen;
import graphics.Sprite;

public class Tile {
	
	//private int x,y;
	public Sprite sprite;
	
	public Tile(Sprite sprite){
		
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen){
		
		
	}
	
	public boolean isSolid(){
		
		return false;
	}

}
