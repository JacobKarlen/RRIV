package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepDownLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowDownLeft.png"));
	
	public ShallowDeepDownLeft() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


