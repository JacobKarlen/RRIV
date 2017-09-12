package Tiles;

import javax.swing.ImageIcon;

public class GrassEdgeUp extends Tile { 
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeUp.png"));
	
	public GrassEdgeUp() {
		super();
		setIcon(icon);
	}
}
