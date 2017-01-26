import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SecondPanel extends JPanel {


	private static final long serialVersionUID = 1L;
	public JButton button1;
	public JTable table;
	public Hero hero1 = new Hero();
	public Hero hero2 = new Hero();
	public Hero hero3 = new Hero();
	public Hero hero4 = new Hero();

	public SecondPanel() {
		
		
		super();
		setPreferredSize(new Dimension(1600, 1000));
		setBackground(new Color(66,88,102));
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);
		c.gridy = 0;
		
		button1 = new JButton("button 2");
		button1.setPreferredSize(new Dimension(200,100));
		add(button1, c);
		
		//centre.setBorder(BorderFactory.createCompoundBorder(new LineBorder(fancyGreen4, 5, true), new EmptyBorder(15,0,0,0)));
		
		String[] columnNames = {"Name", "Race", "Job", "COM", "DEX", "INT", "PER"};
		Object[][] data = {
				{hero1.name, hero1.race, hero1.job, hero1.getCombat(), hero1.dexterity, hero1.intelligence, hero1.personality },
				{hero2.name, hero2.race, hero2.job, hero2.getCombat(), hero2.dexterity, hero2.intelligence, hero2.personality },
				{hero3.name, hero3.race, hero3.job, hero3.getCombat(), hero3.dexterity, hero3.intelligence, hero3.personality },
				{hero4.name, hero4.race, hero4.job, hero4.getCombat(), hero4.dexterity, hero4.intelligence, hero4.personality },
		};
		
		c.gridy = 1;
		JTable table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(1050, 650));
		table.setFillsViewportHeight(true);
		table.setRowHeight(50);
		table.setFont(new Font("Serif", Font.ITALIC, 20));
		table.setBackground(new Color(88,108,128));
		
		for(int i = 0; i < 6; i++) {
			if (i < 2) {
				table.getColumnModel().getColumn(i).setPreferredWidth(300);
			}
		}
		
		add(new JScrollPane(table), c);
		
		
	}
	

	
	
}
