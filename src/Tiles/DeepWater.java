package Tiles;

import javax.swing.ImageIcon;

public class DeepWater extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepWater.png"));
	
	public DeepWater() {
		super();
		setIcon(icon);
	}
}
