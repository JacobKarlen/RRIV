package Tiles;

import javax.swing.ImageIcon;

public class GrassEdgeLeft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeLeft.png"));
	
	public GrassEdgeLeft() {
		super();
		setIcon(icon);
	}
}
