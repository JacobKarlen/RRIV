package Tiles;

import javax.swing.ImageIcon;

public class BeachDown extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/BeachDown.png"));
	
	public BeachDown() {
		super();
		setIcon(icon);
	}
}

