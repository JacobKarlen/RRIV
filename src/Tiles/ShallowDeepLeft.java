package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowLeft.png"));
	
	public ShallowDeepLeft() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


