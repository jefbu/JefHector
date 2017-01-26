package Entity;

public class Race {
	
	public String name;
	public int combatBonus;
	public int skillBonus;
	public int intelligenceBonus;
	public int personalityBonus;
	
	public int raceTier;
		
	public static Race human = new Race("Human", 5, 5, 5, 5, 1);
	public static Race satyr = new Race("Satyr", 5, 10, 5, 0, 1);
	public static Race feline = new Race("Feline", 5, 15, 0, 0, 1);
	public static Race elf = new Race("Elf", 5, 10, 5, 10, 2);
	public static Race dwarf = new Race("Dwarf", 10, 10, 5, 5, 2);
	public static Race dryad = new Race("Dryad", 0, 10, 10, 10, 2);
	
	
	
	
	public Race(String name, int combatBonus, int skillBonus, int intelligenceBonus, int personalityBonus, int raceTier) {
		
		this.name = name;
		this.combatBonus = combatBonus;
		this.skillBonus = skillBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.personalityBonus = personalityBonus;
		this.raceTier = raceTier;
		
		
	}

}
