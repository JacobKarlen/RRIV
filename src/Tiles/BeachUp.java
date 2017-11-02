package Tiles;

import javax.swing.ImageIcon;

public class BeachUp extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeDown.png"));
	
	public BeachUp() {
		super();
		setIcon(icon);
	}
}
