package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepUpRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowUpRight.png"));
	
	public ShallowDeepUpRight() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


