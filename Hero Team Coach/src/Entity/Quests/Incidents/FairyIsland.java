package Entity.Quests.Incidents;

import Graphics.GameScreen;
import Utility.QuestOrder;

public class FairyIsland extends Incident {
	
	public FairyIsland() {
		
		title = "Dancing with the Faeries";
		questOrder = QuestOrder.HOMEWARD;
		
	}
	
	public void outcome() {
		
		GameScreen.questScreen.textLabel.setText(title);
		GameScreen.questSequence++;
		
	}

}
