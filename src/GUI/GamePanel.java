package GUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Game.Main;
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
		
		
		grid[y + 6][x + 6].add(Main.roger); // center roger on screen
		
		// add all enemies to the screen'
		for(int i = 0; i < Main.enemies.size(); i++) {
			x = Main.enemies.get(i).getX();
			y = Main.enemies.get(i).getY();
			grid[y + 6][x + 6].add(Main.enemies.get(i));
		}
		
	} // end constructor
}
