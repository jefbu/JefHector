package Utility;

import java.util.Random;

import Entity.Job;
import Entity.Race;

public class JobFactory {
	
	public JobFactory() {
		
	}
	
	
	
	public static Job generateJob(Race race) {
		
		Random random = new Random();
		int roll = random.nextInt(100) + 1;
		int jobtier;
		if (roll < 65) jobtier = 1;
		else if (roll < 90) jobtier = 2;
		else jobtier = 3;
		
		if(jobtier == 1) {
		
			if (race == Race.human) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 26) return Job.fighter;
				else if (roll < 51) return Job.thief;
				else if (roll < 76) return Job.mage;
				else if (roll < 86) return Job.beggar;
				else if (roll < 96) return Job.woodcutter;
				else return Job.seafarer;
				
			}
			
			else if (race == Race.satyr) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 51) return Job.prankster;
				else if (roll < 76) return Job.thief;
				else if (roll < 86) return Job.fighter;
				else if (roll < 96) return Job.berserker;
				else return Job.mage;				
				
			}
			
			else if (race == Race.feline) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 51) return Job.thief;
				else if (roll < 81) return Job.beggar;
				else if (roll < 91) return Job.prankster;
				else if (roll < 96) return Job.fighter;
				else return Job.seafarer;
				
			}
			
			else if (race == Race.dwarf) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 31) return Job.fighter;
				else if (roll < 61) return Job.berserker;
				else if (roll < 81) return Job.miner;
				else if (roll < 96) return Job.woodcutter;
				else return Job.prankster;
				
			}
			
			else if (race == Race.elf) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 26) return Job.fighter;
				else if (roll < 51) return Job.thief;
				else if (roll < 76) return Job.mage;
				else if (roll < 96) return Job.seafarer;
				else return Job.prankster;
				
			}
			
			else if (race == Race.dryad) {
				
				roll = random.nextInt(100) + 1;
				if (roll < 41) return Job.prankster;
				else if (roll < 71) return Job.thief;
				else if (roll < 91) return Job.mage;
				else return Job.fighter;
				
			}
			
			else return Job.beggar;
			
			
		}
		
		else if (jobtier == 2) return Job.captain;
		
		
		
		
		else return Job.woodcutter;
		
		
	}

}
