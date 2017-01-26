package Utility;

import java.util.Random;

import Entity.Race;
import Entity.Weapon;

public class NameFactory {
	
	public NameFactory() {
		
	}
	
	
	public static String generateName(Race race) {
		
		Random random = new Random();
		int roll = random.nextInt(100) + 1;
		int nametier;
		if (roll < 65) nametier = 1;
		else if (roll < 90) nametier = 2;
		else nametier = 3;
		String completeName = "";
		String firstName = "";
		String lastName = "";
		String firstSyllable = "";
		String secondSyllable = "";
		
		if (nametier == 1) {
		
			if (race == Race.human) {
				
				roll = random.nextInt(7);
				
					switch (roll) {
				
					case 0: firstName = "Martin"; break;
					case 1: firstName = "John"; break;
					case 2: firstName = "Gabriel"; break;
					case 3: firstName = "Bill"; break;
					case 4: firstName = "Thomas"; break;
					case 5: firstName = "George"; break;
					case 6: firstName = "Chris"; break;
					
					}
				
				roll = random.nextInt(7);
				
					switch (roll) {
				
					case 0: lastName = "Smith"; break;
					case 1: lastName = "Thompson"; break;
					case 2: lastName = "Gomez"; break;
					case 3: lastName = "Clayton"; break;
					case 4: lastName = "Clide"; break;
					case 5: lastName = "Marlow"; break;
					case 6: lastName = "King"; break;
					
					}
			
				return firstName + " " + lastName;
			}
			
			else if (race == Race.elf) {
				
				roll = random.nextInt(3);
				
				switch (roll) {
				
				case 0: firstName = "Anduin"; break;
				case 1: firstName = "Thraliel"; break;
				case 2: firstName = "Minthralor"; break;
				
				}
				
				roll = random.nextInt(3);
				
				switch (roll) {
				
				case 0: firstSyllable = "Silver"; break;
				case 1: firstSyllable = "True"; break;
				case 2: firstSyllable = "Angel"; break;
				
				}
				
				roll = random.nextInt(3);
				
				switch (roll) {
				
				case 0: secondSyllable = "arrow"; break;
				case 1: secondSyllable = "leaf"; break;
				case 2: secondSyllable = "wind"; break;
				
				}
				
				return firstName + " " + firstSyllable + secondSyllable;
					
			}
			
			else if (race == Race.dwarf) {
				
				roll = random.nextInt(5);
				
				switch (roll) {
				
				case 0: firstName = "Gunni"; break;
				case 1: firstName = "Snorri"; break;
				case 2: firstName = "Arbak"; break;
				case 3: firstName = "Fjorden"; break;
				case 4: firstName = "Malin"; break;
				
				}
				
				roll = random.nextInt(3);
				
				switch (roll) {
				
				case 0: firstSyllable = "Hammer"; break;
				case 1: firstSyllable = "Iron"; break;
				case 2: firstSyllable = "Rune"; break;
				
				}
				
				roll = random.nextInt(3);
				
				switch (roll) {
				
				case 0: secondSyllable = "breaker"; break;
				case 1: secondSyllable = "arm"; break;
				case 2: secondSyllable = "bones"; break;
				
				}
				
				return firstName + " " + firstSyllable + secondSyllable;
				
			}
			
			else if (race == Race.satyr) {
				
				roll = random.nextInt(6);
				
				switch (roll) {
				
				case 0: completeName = "Xhiaros"; break;
				case 1: completeName = "Efkharon"; break;
				case 2: completeName = "Oxina"; break;
				case 3: completeName = "Tsadzenos"; break;
				case 4: completeName = "Tsinaxi"; break;
				case 5: completeName = "Placrotelos"; break;
				
				}
				
				return completeName;
				
			}
			
			else if (race == Race.feline) {
				
				roll = random.nextInt(5);
				
				switch (roll) {
				
				case 0: firstName = "Kitty"; break;
				case 1: firstName = "Tiger"; break;
				case 2: firstName = "Tomcat"; break;
				case 3: firstName = "Felix"; break;
				case 4: firstName = "Whiskers"; break;
				
				}
				
				roll = random.nextInt(3);
				
				switch (roll) {
				
				case 0: lastName = "Siamese"; break;
				case 1: lastName = "Cheshire"; break;
				case 2: lastName = "Stripes"; break;
				
				}
				
				return firstName + " " + lastName;
				
			}
			
			else if (race == Race.dryad) {
				
				roll = random.nextInt(5);
				
				switch (roll) {
				
				case 0: completeName = "Aroma"; break;
				case 1: completeName = "Petal"; break;
				case 2: completeName = "Foliage"; break;
				case 3: completeName = "Blossom"; break;
				case 4: completeName = "Fragrance"; break;
				
				}
				
				return completeName;
				
			}
			
			else return "Papapopoulos";
			
		}
		
		else return "Papapopoulos";
		

		
		
		
		
		
	}
	
	public static String generateName(Weapon weapon) {
		
		Random random = new Random();
		String firstPart = "";
		String secondPart = "";
		
		int roll = random.nextInt(5);
		
		switch (roll) {
		
		case 0: firstPart = "Dragon"; break;
		case 1: firstPart = "Evil"; break;
		case 2: firstPart = "Dark"; break;
		case 3: firstPart = "Heart"; break;
		case 4: firstPart = "Yarrow"; break;
		
		}
		
		roll = random.nextInt(5);
		
		switch (roll) {
		
		case 0: secondPart = "slayer"; break;
		case 1: secondPart = "pierce"; break;
		case 2: secondPart = "bane"; break;
		case 3: secondPart = "downfall"; break;
		case 4: secondPart = "";
		
		
		}
		
		return firstPart + secondPart;
		
	}


	
	

}
