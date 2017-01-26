package Entity.Quests.Incidents;

import Graphics.GameScreen;

public class TrollUnderTheBridgeConclusion extends Incident {
	
	public TrollUnderTheBridgeConclusion() {
		
		title = "The Troll Under the Bridge";
		
	}
	
	public void outcome() {
		
		GameScreen.questScreen.textLabel.setText(title);
		GameScreen.questSequence++;
		
	}

}
