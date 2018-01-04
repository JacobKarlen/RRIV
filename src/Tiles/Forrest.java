package Tiles;

import javax.swing.ImageIcon;

public class Forrest extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/Forrest.png"));
	
	public Forrest() {
		super();
		setIcon(icon);
	}
}
