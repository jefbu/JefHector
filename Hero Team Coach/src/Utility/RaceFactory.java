package Utility;

import java.util.Random;

import Entity.Race;

public class RaceFactory {
	
	public RaceFactory() {
		
	}
	
	public static Race generateRace() {
		
		Random random = new Random();
		
		int roll = random.nextInt(100) + 1;
		int racetier;
		if (roll < 65) racetier = 1;
		else if (roll < 90) racetier = 2;
		else racetier = 3;
		
		if (racetier == 1) {
			roll = random.nextInt(100) + 1;
			if (roll < 61) return Race.human;
			else if (roll < 81) return Race.satyr;
			else return Race.feline; 
				}
		
		else if (racetier == 2) {
			roll = random.nextInt(100) + 1;
			if (roll < 41) return Race.dwarf;
			else if (roll < 81) return Race.elf;
			else return Race.dryad;			
				}


		else return Race.human;
		
		
		
		
	}
	

}
