package Tiles;

import javax.swing.ImageIcon;

public class BeachDown extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeUpleft.png"));
	
	public BeachDown() {
		super();
		setIcon(icon);
	}

}
