package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowLeft.png"));
	
	public DeepShallowLeft() {
		super();
		setIcon(icon);
	}
}
