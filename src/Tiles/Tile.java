package Tiles;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tile extends JLabel {
	
	public boolean collision = false;
	
	public Tile() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setSize(64, 64);
		setVisible(true);
		setOpaque(true);
	}
}
