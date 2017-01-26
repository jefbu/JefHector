import java.util.Random;

public class Hero {
	
	private int combat; 
	public int dexterity, intelligence, personality;
	private static final Random random = new Random();
	public String name;
	public String race;
	public String job;
	NameFactory nameFactory = new NameFactory();
	RaceBuilder raceBuilder = new RaceBuilder();
	JobCreator jobCreator = new JobCreator();

	public Hero() {
		
		name = nameFactory.createName();
		race = raceBuilder.generateRace();
		job = jobCreator.generateJob(race);
		combat = random.nextInt(100) + 1;
		dexterity = random.nextInt(100) + 1;
		intelligence = random.nextInt(100) + 1;
		personality = random.nextInt(100) + 1;
		
	}




	public int getCombat(){
		return combat;
		
	}
	
		
}