package Graphics.Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Graphics.GameScreen;
import Graphics.ImageLoader;

public class QuestScreen extends JPanel {
	

	private static final long serialVersionUID = 1L;
	
	private JPanel titlePanel;
	public JLabel titleLabel;
	private JPanel abortPanel;
	private JButton abortButton;
	private JPanel imagePanel;
	public JLabel imageLabel;
	private JPanel advancePanel;
	private JButton advanceButton;
	private JPanel textPanel;
	public JLabel textLabel;
	

	public QuestScreen() {
		
		super();
		
		setPreferredSize(new Dimension(GameScreen.WIDTH, GameScreen.HEIGHT));
		setBackground(GameScreen.backgroundColor);
		setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension (1400, 60));
		titlePanel.setBackground(GameScreen.mediumColor);
		titlePanel.setBorder(new LineBorder(GameScreen.borderColor, 3, false));
		add(titlePanel);
		
			titleLabel = new JLabel();
			titlePanel.add(titleLabel);
			
		abortPanel = new JPanel();
		abortPanel.setPreferredSize(new Dimension(400, 600));
		abortPanel.setBackground(GameScreen.backgroundColor);
		abortPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 150));
		add(abortPanel);
			
			abortButton = new JButton();
			abortButton.setPreferredSize(new Dimension(300, 300));
			abortPanel.add(abortButton);
			
				abortButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						
						GameScreen.questScreen.setVisible(false);
						GameScreen.teamOverviewScreen.setVisible(true);
						
					}

				});
				
	
		imagePanel = new JPanel();
		imagePanel.setPreferredSize(new Dimension (800, 600));
		imagePanel.setBackground(GameScreen.lessImportantColor);
		imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		//imagePanel.setBorder(new LineBorder(GameScreen.borderColor, 3, false));
		add(imagePanel);
		
			imageLabel = new JLabel();
			imagePanel.add(imageLabel);
		
		advancePanel = new JPanel();
		advancePanel.setPreferredSize(new Dimension(400, 600));
		advancePanel.setBackground(GameScreen.backgroundColor);
		advancePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 150));
		add(advancePanel);
		
			advanceButton = new JButton();
			advanceButton.setPreferredSize(new Dimension(300, 300));
			advancePanel.add(advanceButton);
			
				advanceButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (GameScreen.questSequence == GameScreen.currentQuest.incidentList.size()) {
							GameScreen.questSequence = 0;
							GameScreen.questScreen.setVisible(false);
							GameScreen.teamOverviewScreen.setVisible(true);
							
						}
						
						else GameScreen.currentQuest.incidentList.get(GameScreen.questSequence).outcome();
						
					}
					
				});
		
		
		textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(1400, 250));
		textPanel.setBackground(GameScreen.mediumColor);
		textPanel.setBorder(new LineBorder(GameScreen.borderColor, 3, false));
		add(textPanel);
		
			textLabel = new JLabel();
			textPanel.add(textLabel);
		
			
	}
	
	
	

	
	public void initiate() {
		
		GameScreen.questScreen.setVisible(true);
		GameScreen.questScreen.titleLabel.setText(GameScreen.currentQuest.title);
				
			GameScreen.currentQuest.incidentList.get(GameScreen.questSequence).outcome();
			
	}

}
