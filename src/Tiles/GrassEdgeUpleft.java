package Tiles;

import javax.swing.ImageIcon;

public class GrassEdgeUpleft extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeUpleft.png"));
	
	public GrassEdgeUpleft() {
		super();
		setIcon(icon);
	}

}
