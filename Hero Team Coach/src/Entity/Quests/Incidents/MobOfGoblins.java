package Entity.Quests.Incidents;

import java.util.ArrayList;
import java.util.Random;

import Entity.Mob;
import Graphics.GameScreen;
import Utility.QuestOrder;

public class MobOfGoblins extends Incident {
	
	Random random = new Random();
	
	public MobOfGoblins() {
		
		title = "Mob of Goblins";
		
		enemies = new ArrayList<Mob>();
		
		questOrder = QuestOrder.ENROUTE;
		int enemies = random.nextInt(3) + 3;
		
		for (int i = 0; i < enemies; i++) {
			
		this.enemies.add(Mob.Goblin);
		
		}
	}
	
	public void outcome() {
		
		GameScreen.questScreen.textLabel.setText(title);
		GameScreen.questSequence++;
		
	}
	

}
