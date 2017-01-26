import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {


	private static final long serialVersionUID = 1L;
	public JButton button1 = null;
	public JButton button2 = null;

	public MainPanel() {
		
		super();
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		
				
		setPreferredSize(new Dimension(1600,1000));
		setBackground(Color.BLUE);
		c.gridx = 0;
		c.gridy = 0;
		button1 = new JButton("button 1");
		button1.setPreferredSize(new Dimension(200,100));
		add(button1, c);
		c.gridx = 1;
		c.gridy = 0;
		button2 = new JButton("button 2");
		button2.setPreferredSize(new Dimension(200,100));
		add(button2, c);
		
	}
	
}
