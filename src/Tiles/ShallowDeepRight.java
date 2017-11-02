package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowRight.png"));
	
	public ShallowDeepRight() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


