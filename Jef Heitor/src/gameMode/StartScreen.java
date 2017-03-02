package gameMode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import global.GameManager;
import global.Screen;

public class StartScreen implements ActionListener, GameMode {

	Screen screen = new Screen();

	Font font0 = new Font("arial", Font.BOLD, 50);
	Font font1 = new Font("arial", Font.BOLD, 20);
	byte id = 0;
	public static BufferStrategy bufferStrategy;
	public static BufferedImage background = new BufferedImage(GameManager.getWidth(), GameManager.getHeight(),
			BufferedImage.TYPE_INT_RGB);
	public static int[] pixelLocation = ((DataBufferInt) background.getRaster().getDataBuffer()).getData();
	private long oldSystemTime = System.currentTimeMillis();

	public void update() {

		if (GameManager.gameStart.im.up == true) {

			if (System.currentTimeMillis() - oldSystemTime > 192) {

				id--;

				if (id < 0) {
					id = 2;
				}
				oldSystemTime = System.currentTimeMillis();
			}
		}
		if (GameManager.gameStart.im.down == true) {

			if (System.currentTimeMillis() - oldSystemTime > 192) {

				id++;

				if (id > 2) {
					id = 0;
				}
				oldSystemTime = System.currentTimeMillis();
			}
		}
		if (GameManager.gameStart.im.accept == true) {
			if (System.currentTimeMillis() - oldSystemTime > 192) {

			GameManager.setGameModeId(id);
			oldSystemTime = System.currentTimeMillis();
			}
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
		g.setColor(Color.PINK);
		g.fillRect(0, 0, GameManager.getWidth(), GameManager.getHeight());
		// g.drawImage(background, 0, 0, null);
		renderMenu(g, id);
		g.dispose();
		bufferStrategy.show();

	}

	public void renderMenu(Graphics g, byte id) {

		int width = GameManager.getWidth() / 3, height = GameManager.getHeight() / 3;
		int sWidth = GameManager.getWidth() / 2, sHeight = GameManager.getHeight() - height - 50;
		Color color1, color2, color3;
		g.setColor(Color.PINK);
		g.drawRect(sWidth - width / 2, sHeight, width, height);

		if (id == 0) {
			color1 = Color.BLUE;
			color2 = Color.WHITE;
			color3 = Color.WHITE;
		} else if (id == 1) {
			color1 = Color.WHITE;
			color2 = Color.BLUE;
			color3 = Color.WHITE;
		} else {
			color1 = Color.WHITE;
			color2 = Color.WHITE;
			color3 = Color.BLUE;
		}

		g.setFont(font0);

		g.setColor(color1);
		g.drawRect(sWidth - width / 2, sHeight, width, height / 3);
		g.drawString("New Game", (sWidth - width / 2), sHeight + height / 3);

		g.setColor(color2);
		g.drawRect(sWidth - width / 2, sHeight + height / 3 + 1, width, height / 3);
		g.drawString("Continue", sWidth - width / 2, sHeight + 2 * height / 3);

		g.setColor(color3);
		g.drawRect(sWidth - width / 2, sHeight + 2 * height / 3 + 2, width, height / 3);
		g.drawString("Exit", sWidth - width / 2, sHeight + 3 * height / 3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
