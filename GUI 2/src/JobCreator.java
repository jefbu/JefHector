import java.util.Random;

public class JobCreator {
	
	private static final Random random = new Random();

	public JobCreator() {
		
	}
	
	public String generateJob(String race) {
		
		if (race == "Human") {
			
			int jobnumber = random.nextInt(8);
			
			if (jobnumber < 3) return "Fighter";
			else if (jobnumber < 6) return "Mage";
			else return "Thief";

		}
		
		if (race == "Dwarf") {
			
			int jobnumber = random.nextInt(8);
			
			if (jobnumber < 5) return "Fighter";
			else if (jobnumber < 8) return "Barbarion";
			else return "Smith";
			
			
			
		}
		
		if (race == "Elf") {
			
			int jobnumber = random.nextInt(8);
			
			if (jobnumber < 4) return "Thief";
			else if (jobnumber < 7) return "Mage";
			else return "Paladin";

		
		}
		
		else return "ErrorCoder";
		
	}
	
}
