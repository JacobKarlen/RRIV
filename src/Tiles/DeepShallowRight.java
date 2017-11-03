package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowRight.png"));
	
	public DeepShallowRight() {
		super();
		setIcon(icon);
	}
}

