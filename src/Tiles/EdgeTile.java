package Tiles;

import javax.swing.ImageIcon;

public class EdgeTile extends Tile {
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/EdgeTile.png"));
	
	public EdgeTile() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}
