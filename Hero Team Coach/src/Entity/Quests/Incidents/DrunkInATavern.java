package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class DrunkInATavern extends Incident {
	
	public DrunkInATavern() {
		
		title = "Drunk in a Tavern";
		questOrder = QuestOrder.ENROUTE;
		
	}
	
	public void outcome() {
		
		GameScreen.questScreen.textLabel.setText(title);
		GameScreen.questSequence++;
		
	}

}
