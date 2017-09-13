package Tiles;

import javax.swing.ImageIcon;

public class GrassTile2 extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/GrassTile2.png"));
	
	public GrassTile2() {
		super();
		setIcon(icon);
	}
}
