package Tiles;

import javax.swing.ImageIcon;

public class BeachDownRight extends Tile { 
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassEdgeUp.png"));
	
	public BeachDownRight() {
		super();
		setIcon(icon);
	}
}
