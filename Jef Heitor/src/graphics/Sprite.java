package graphics;

public class Sprite {

	private SpriteSheet sheet;
	private int x, y;
	private int[] pixels;
	private final int SIZEH, SIZEW;

	public Sprite(SpriteSheet sheet, int x, int y, int sIZEH, int sIZEW) {

		this.sheet = sheet;
		SIZEH = sIZEH;
		SIZEW = sIZEW;
		this.x = x * sIZEW;
		this.y = y * sIZEH;
		pixels = new int[SIZEH * SIZEW];
		load();
	}
	
	public Sprite (int sIZEH, int sIZEW, int colour){
		SIZEH = sIZEH;
		SIZEW = sIZEW;
		pixels = new int[SIZEH * SIZEW];
		for(int i = 0; i < SIZEH * SIZEW; i++){
			pixels [i] = colour;
		}
		
	}
	
	private void load() {
		
		for(int y = 0; y < SIZEH; y++){
			
			for(int x = 0; x < SIZEW; x++){
				pixels[x + y * SIZEH] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.sheetWidth];
				
			}
			
		}
	}

	public int[] getPixels() {
		return pixels;
	}

	public int getSIZEW() {
		return SIZEW;
	}
	
	public int getSIZEH() {
		return SIZEH;
	}

}
