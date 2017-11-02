package Tiles;

import javax.swing.ImageIcon;

public class BeachRight extends Tile {

	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeRight.png"));
	
	public BeachRight() {
		super();
		setIcon(icon);
	}
}
