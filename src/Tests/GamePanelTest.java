package Tests;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GUI.GamePanel;
import Tiles.GrassTile;
import Tiles.Tile;

public class GamePanelTest extends JFrame {
	public GamePanelTest() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(1366, 768);
		GamePanel p1 = new GamePanel(0, 0);
		add(p1);
		p1.setVisible(true);
		p1.repaint();
	
	}
	public static void main(String[] args) {
		GamePanelTest test = new GamePanelTest();
		
	}
}
