package global;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;



public class GameStart extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static int width = 800;
	public static int height = width / 16 * 9;
	public static int scale = 1;
	private JFrame frame;
	private Thread thread;
	private boolean running = false;
	private long oldSysTime;
	public InputManager im;
	
	

	public GameStart() {
			
		//Disable for full screen
		Dimension size = new Dimension (width * scale, height * scale);
		//Disable for full screen
		setPreferredSize(size);
		frame = new JFrame();
		
		im = new InputManager();
		addKeyListener(im);

		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setUndecorated(true);
		
		//Disable for full screen
		frame.setResizable(false);
		frame.setTitle("Diplomatic, a game made by Quality Matters");
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Disable for full screen
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	
	public synchronized void start () {
		running = true;
		thread = new Thread(this, "firstThread");
		thread.start();
	}
	
	public synchronized void stop () {
		running = false;
		try {
			thread.join();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}

	
	public void run() {
		//long fps = System.currentTimeMillis();
		oldSysTime = System.currentTimeMillis();
		//int count = 0;
		System.out.println("ok");
		requestFocus();
		while (running == true){
			if ((System.currentTimeMillis() - oldSysTime)>16){
			/*	count++;

				if (count == 60){
					System.out.println((System.currentTimeMillis()-fps));
					fps = System.currentTimeMillis();
					count = 0;
				}*/
				
				GameManager.gameIterate();
				im.update();
				oldSysTime = System.currentTimeMillis();
				
				
			}
			
		}
		
	}
	

	
	

}
