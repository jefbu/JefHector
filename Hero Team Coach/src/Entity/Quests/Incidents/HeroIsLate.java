package Entity.Quests.Incidents;

import javax.swing.JLabel;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class HeroIsLate extends Incident {
	
	public HeroIsLate() {
		
		title = "Timely Departure";
		questOrder = QuestOrder.BEGINNING;
		
		
	}
	
	public void outcome() {
		
		GameScreen.questScreen.textLabel.setText(title);
		GameScreen.questScreen.imageLabel.setIcon(imageLoader.loadImageIcon("/Images/Incidents/HeroIsLate.png"));
		GameScreen.questSequence++;

		
	}

}
