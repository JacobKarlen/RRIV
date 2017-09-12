package Tiles;

import javax.swing.ImageIcon;

public class GrassEdgeDown extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeDown.png"));
	public GrassEdgeDown() {
		super();
		setIcon(icon);
	}
}
