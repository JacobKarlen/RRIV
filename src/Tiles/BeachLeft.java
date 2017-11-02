package Tiles;

import javax.swing.ImageIcon;

public class BeachLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/EdgeTile.png"));
	
	public BeachLeft() {
		super();
		setIcon(icon);
		
	}
}


