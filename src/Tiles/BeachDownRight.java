package Tiles;

import javax.swing.ImageIcon;

public class BeachDownRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/BeachDownRight.png"));
	
	public BeachDownRight() {
		super();
		setIcon(icon);
	}
}
