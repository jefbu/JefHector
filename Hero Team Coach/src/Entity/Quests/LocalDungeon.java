package Entity.Quests;

import java.util.Random;

public class LocalDungeon extends Quest {
	
	Random random = new Random();
	
	public LocalDungeon() {
		
		this.title = "Explore Local Dungeon";
		this.focus = "Combat";
		
		this.risk = 30 + random.nextInt(21);
		this.cash = 15 + random.nextInt(21);
		this.loot = 30 + random.nextInt(21);
		this.fame = 20 + random.nextInt(16);
		
		this.contractFee = 30000 + random.nextInt(21) * 1000;
		
		
		
	}
	
}


