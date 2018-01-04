package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowDownLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowDownLeft.png"));
	
	public DeepShallowDownLeft() {
		super();
		setIcon(icon);
	}
}
