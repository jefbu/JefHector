import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener {
	

	private static final long serialVersionUID = 1L;

	public Window() {

		super("GUI 2");
		setLayout(new FlowLayout());
		setSize(1600, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		MainPanel mainPanel = new MainPanel();

		add(mainPanel);
		SecondPanel secondPanel = new SecondPanel();
		secondPanel.setVisible(false);
		add(secondPanel);
	
		//mainPanel.button1.setVisible(false);
		mainPanel.button1.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e) {
			secondPanel.setVisible(true);
			mainPanel.setVisible(false);
			//System.out.println("clickity click");
			
		}
		});
		
		secondPanel.button1.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent e) {
			mainPanel.setVisible(true);
			secondPanel.setVisible(true);
			//System.out.println("clickity click");
			
		}
		});
		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

	
	
	
}
