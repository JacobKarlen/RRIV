package Tiles;

import javax.swing.BoxLayout;
import javax.swing.JLabel;


public class Tile extends JLabel {
	
	public boolean collision = false;
	
	public Tile() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setSize(64, 64);
		setVisible(true);
		setOpaque(true);
		
	}
}
