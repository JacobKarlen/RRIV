package Tiles;

import javax.swing.ImageIcon;

public class ShallowDeepDownRight extends Tile{
	
	ImageIcon icon = new ImageIcon(this.getClass().getResource("/Images/DeepShallowDownRight.png"));
	
	public ShallowDeepDownRight() {
		super();
		setIcon(icon);
		
		collision = true;
	}
}


