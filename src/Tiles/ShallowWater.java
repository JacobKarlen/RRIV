package Tiles;

import javax.swing.ImageIcon;

public class ShallowWater extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/ShallowSea.png"));
	
	public ShallowWater() {
		super();
		setIcon(icon);
	}
}
