package global;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputManager implements KeyListener {
	
	private boolean[] keys = new boolean[256];
	public boolean up,down,left,right,accept = false;

	public void update(){
		
		up =	 keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
		down =	 keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
		left =	 keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
		right =	 keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];
		accept = keys[KeyEvent.VK_ENTER];
	}
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

	public void keyTyped(KeyEvent e) {

		
	}

}
