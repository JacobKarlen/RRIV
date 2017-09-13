package Tiles;

import javax.swing.ImageIcon;

public class GrassTile extends Tile { 
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassTile1.png"));
	
	public GrassTile() {
		super();
		setIcon(icon);
	}
}
