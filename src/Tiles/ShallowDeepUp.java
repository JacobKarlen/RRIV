package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepUp extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowUp.png"));
	
	public ShallowDeepUp() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


