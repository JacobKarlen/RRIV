package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowUpLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowUpLeft.png"));
	
	public DeepShallowUpLeft() {
		super();
		setIcon(icon);
	}
}
