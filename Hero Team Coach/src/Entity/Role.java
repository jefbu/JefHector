package Entity;

import javax.swing.ImageIcon;

import Graphics.ImageLoader;

public class Role {
	
	public ImageIcon icon;
	public String name;
	ImageLoader imageLoader = new ImageLoader();
	

	public static Role idle = new Role("/Images/Portraits/human_fighter_male.png", "Idle");
	public static Role blacksmith = new Role("/Images/Portraits/blacksmith.png", "Blacksmith");
	public static Role accountManager = new Role("/Images/Portraits/account_manager.png", "Account Manager");
	
	
	public Role(String path, String name) {
		
		icon = imageLoader.loadImageIcon(path);
		this.name = name;
		
	}
	

	
	

}
