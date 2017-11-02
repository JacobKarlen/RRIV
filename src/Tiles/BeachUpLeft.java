package Tiles;

import javax.swing.ImageIcon;

public class BeachUpLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/EdgeTile.png"));
	
	public BeachUpLeft() {
		super();
		setIcon(icon);

	}
}


