package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepUpLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowUpLeft.png"));
	
	public ShallowDeepUpLeft() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


