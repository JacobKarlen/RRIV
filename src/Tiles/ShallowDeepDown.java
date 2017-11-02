package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepDown extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowDown.png"));
	
	public ShallowDeepDown() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


