package Tiles;

import javax.swing.ImageIcon;

public class Lake extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/Lake.png"));
	
	public Lake() {
		super();
		setIcon(icon);
	}
}

