package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowUpRight extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowUpRight.png"));
	
	public DeepShallowUpRight() {
		super();
		setIcon(icon);
	}
}
