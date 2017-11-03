package Tiles;

import javax.swing.ImageIcon;

public class BeachUpRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/BeachUpRight.png"));
	
	public BeachUpRight() {
		super();
		setIcon(icon);
	}
}
