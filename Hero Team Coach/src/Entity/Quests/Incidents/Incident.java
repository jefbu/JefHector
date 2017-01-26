package Entity.Quests.Incidents;

import java.util.ArrayList;

import Entity.Armour;
import Entity.Mob;
import Entity.Weapon;
import Graphics.ImageLoader;
import Utility.QuestOrder;

public abstract class Incident {
	
	public String title;
	
	public QuestOrder questOrder;
	
	public ArrayList<Mob> enemies;
	public ArrayList<Weapon> weapons;
	public ArrayList<Armour> armour;
	
	protected ImageLoader imageLoader = new ImageLoader();


public Incident() {

}

public void outcome() {
	
}


}




