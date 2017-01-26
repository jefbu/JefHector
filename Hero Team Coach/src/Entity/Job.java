package Entity;

public class Job {

	public String name;
	public int combatBonus;
	public int skillBonus;
	public int intelligenceBonus;
	public int personalityBonus;

	public int combatLevelUp;
	public int skillLevelUp;
	public int intelligenceLevelUp;
	public int personalityLevelUp;

	public int jobTier;

	public static Job fighter = new Job("Fighter", 10, 0, 0, 0, 50, 45, 40, 45, 1);
	public static Job thief = new Job("Thief", 0, 10, 0, 0, 45, 50, 45, 40, 1);
	public static Job mage = new Job("Mage", 0, 0, 10, 0, 40, 45, 50, 45, 1);
	public static Job woodcutter = new Job("Woodcutter", 5, 5, 0, 0, 50, 50, 40, 40, 1);
	public static Job prankster = new Job("Prankster", 0, 10, 0, 0, 40, 60, 40, 40, 1);
	public static Job seafarer = new Job("Seafarer", 5, 5, 5, 5, 45, 45, 40, 40, 1);
	public static Job captain = new Job("Captain", 10, 5, 5, 10, 50, 40, 40, 50, 2);
	public static Job miner = new Job("Miner", 5, 5, 0, 0, 50, 50, 40, 40, 1);
	public static Job berserker = new Job ("Berserker", 15, 0, 0, 0, 55, 45, 30, 30, 1);
	public static Job beggar = new Job ("Beggar", 0, 10, 0, -5, 40, 55, 40, 35, 1);

	public Job(String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus,
			int combatLevelUp, int skillLevelUp, int intelligenceLevelUp, int personalityLevelUp, int jobTier) {

		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;
		this.combatLevelUp = combatLevelUp;
		this.skillLevelUp = skillLevelUp;
		this.intelligenceLevelUp = intelligenceLevelUp;
		this.personalityLevelUp = personalityLevelUp;
		this.jobTier = jobTier;

	}

}
