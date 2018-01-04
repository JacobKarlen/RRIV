package Tiles;

import javax.swing.ImageIcon;

public class BeachUp extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/BeachUp.png"));
	
	public BeachUp() {
		super();
		setIcon(icon);
	}
}
