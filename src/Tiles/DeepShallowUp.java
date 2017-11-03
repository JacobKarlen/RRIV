package Tiles;

import javax.swing.ImageIcon;

public class DeepShallowUp extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowUp.png"));
	
	public DeepShallowUp() {
		super();
		setIcon(icon);
	}
}
