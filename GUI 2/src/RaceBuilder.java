import java.util.Random;

public class RaceBuilder {

	private final static Random random = new Random();
	
	public RaceBuilder() {
		
	}
	
	public String generateRace() {
		
		 int race = random.nextInt(99);
		 
		 if (race < 50) {
			 return "Human";
		 }
		 else if (race < 70) {
			 return "Elf";
		 }
		 else if (race < 90) {
			 return "Dwarf";
		 }
		 else return "Freak of Nature";
		 
			 
		 }
		 
				
	
	
}
