package GUI;

import java.awt.*;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Game.GameSettings;
import Tiles.Tile;

public class GamePanel extends JPanel {
	
	private int width = 12; // 13 tiles wide
	private int height = 11; // 12 tiles high
	
	public GamePanel(int x, int y) {
		setSize(832, 768);
		setMaximumSize(new Dimension(832, 768));
		setVisible(true);
		setLayout(new GridLayout(height + 1, width + 1));
		
		Tile[][] grid = Game.Main.map.grid;
		
		
			for(int i = y; i < y + 12; i++) { // nested loops adding tiles to panel
				for(int j = x; j < x + 13; j++) {
					Tile tile = grid[i][j];
					add(tile);
					tile.setVisible(true);
					tile.setOpaque(true);
				}
			}
		
		
		grid[y + 6][x + 6].add(GameSettings.roger); // center roger on screen
		
	} // end constructor
}
