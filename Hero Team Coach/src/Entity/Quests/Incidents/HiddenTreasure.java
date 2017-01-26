package Entity.Quests.Incidents;

import Graphics.GameScreen;

public class HiddenTreasure extends Incident {
	
	public HiddenTreasure() {
		
		title = "A Hidden Treasure found";
		
	}
	
	public void outcome() {
		
		GameScreen.questScreen.textLabel.setText(title);
		GameScreen.questSequence++;
		
	}

}
