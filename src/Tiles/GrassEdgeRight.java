package Tiles;

import javax.swing.ImageIcon;

public class GrassEdgeRight extends Tile {

	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeRight.png"));
	
	public GrassEdgeRight() {
		super();
		setIcon(icon);
	}
}
