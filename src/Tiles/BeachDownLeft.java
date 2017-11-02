package Tiles;

import javax.swing.ImageIcon;

public class BeachDownLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/EdgeTile.png"));
	
	public BeachDownLeft() {
		super();
		setIcon(icon);
		
	}
}


