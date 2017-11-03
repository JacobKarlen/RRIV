package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowDown extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowDown.png"));
	
	public DeepShallowDown() {
		super();
		setIcon(icon);
	}
}
