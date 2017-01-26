package graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private final int SIZEH;
	private final int SIZEW;
	private final int ELEMENTS;
	public int sheetWidth;
	private String path;
	public int[] pixels;
	
	public SpriteSheet(int sIZEH, int sIZEW, int eLEMENTS, String path) {

		SIZEH = sIZEH;
		SIZEW = sIZEW;
		ELEMENTS = eLEMENTS;
		this.path = path;
		pixels = new int[SIZEH * SIZEW * ELEMENTS];
		load();
	}

	private void load() {
		
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int h = image.getHeight();
			sheetWidth = image.getWidth();
			image.getRGB(0, 0, sheetWidth, h, pixels, 0, sheetWidth);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
