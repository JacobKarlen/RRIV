package GUI;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.GameSettings;
import Game.Main;

public class Roger extends JLabel {
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	public Roger() {
		setIcon(left);
	}
	public void move(int x, int y) {
		if(x >= 0 && y >= 0) { // check valid top-left corner
			if(y + 11 < Main.map.grid.length && x + 12 < Main.map.grid[0].length) { // check valid bot-right corner
				if(!Main.map.grid[y + 6][x + 6].collision) {
					GameSettings.screen_x = x;
					GameSettings.screen_y = y;
					Main.display.remove(Main.display.gp);
					Main.display.gp = new GamePanel(GameSettings.screen_x, GameSettings.screen_y);
					Main.display.add(Main.display.gp, BorderLayout.WEST);
					Main.display.gp.revalidate();
					Main.display.gp.repaint();
				}
			}
		}
	}
	public void movingLeft() {
		setIcon(left);
	}
	public void movingRight() {
		setIcon(right);
	}
	public void movingUp() {
		setIcon(up);
	}
	public void movingDown() {
		setIcon(down);
	}
	public void setHealth(int hp) {
		ControlPanel.hpBar.updateHealth(hp);
	}
	public int getHealth() {
		return ControlPanel.hpBar.getHealth();
	}
	
}
