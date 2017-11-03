package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowDownRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowDownRight.png"));
	
	public DeepShallowDownRight() {
		super();
		setIcon(icon);
	}
}
