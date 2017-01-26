import java.util.Random;

public class NameFactory {
	
	String firstSyllable;
	String secondSyllable;
	String thirdSyllable;
	String fourthSyllable;
	private final static Random random = new Random();
	
	public NameFactory() {
		
	}
	
	public String createName() {
		
		int first = random.nextInt(5);
		switch (first) {
		
		case 0: firstSyllable = "Kun";
		break;
		case 1: firstSyllable = "Mel";
		break;
		case 2: firstSyllable = "Pae";
		break;
		case 3: firstSyllable = "Ter";
		break;
		case 4: firstSyllable = "Yu";
		break;
		case 5: firstSyllable = "Fier";
		break;
		
		}
		

		int second = random.nextInt(5);
		switch (second) {
		
		case 0: secondSyllable = "nis";
		break;
		case 1: secondSyllable = "dric";
		break;
		case 2: secondSyllable = "mai";
		break;
		case 3: secondSyllable = "is";
		break;
		case 4: secondSyllable = "fin";
		break;
		case 5: secondSyllable = "";
		break;
		
		}
		
		int third = random.nextInt(6);
		switch (third) {
		
		case 0: thirdSyllable = "por";
		break;
		case 1: thirdSyllable = "ing";
		break;
		case 2: thirdSyllable = "ten";
		break;
		case 3: thirdSyllable = "";
		break;
		case 4: thirdSyllable = "";
		break;
		case 5: thirdSyllable = "";
		break;
		case 6: thirdSyllable = "";
		break;
		
		}
		
		int fourth = random.nextInt(6);
		switch (fourth) {
		
		case 0: fourthSyllable = "ix";
		break;
		case 1: fourthSyllable = "";
		break;
		case 2: fourthSyllable = "";
		break;
		case 3: fourthSyllable = "";
		break;
		case 4: fourthSyllable = "";
		break;
		case 5: fourthSyllable = "";
		break;
		case 6: fourthSyllable = "";
		break;
		
		}
		
		
		
		
		return firstSyllable + secondSyllable + thirdSyllable + fourthSyllable;
	}

}
