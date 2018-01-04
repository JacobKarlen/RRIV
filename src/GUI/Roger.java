package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.Main;

public class Roger extends JLabel {
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	private int x, y;
	private int direction = 4;

	public Roger(int xPos, int yPos) {
		this.setIcon(left);
		this.setVerticalAlignment(CENTER);
		this.setSize(new Dimension(64, 64));
		this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.red),
                this.getBorder()));
		this.x = xPos;
		this.y = yPos;
		
	}
	public static boolean validateMove(int x, int y) {
		if(x >= 0 && y >= 0) { // check valid top-left corner
			if(y + 11 < Main.map.grid.length && x + 12 < Main.map.grid[0].length) { // check valid bot-right corner
				if(!Main.map.grid[y + 6][x + 6].collision) {
					return true;
				}
			}
		}
		return false;
	}
	public void move() {
		int initX = this.x;
		int initY = this.y;
		
		if (direction == 0) { // up
			this.y--;
			movingUp();
		} else if (direction == 1) { // right
			this.x++;
			movingRight();
		} else if(direction == 2) { // down
			this.y++;
			movingDown();
		} else if(direction == 3) { // left
			this.x--;
			movingLeft();
		} else if(direction == 4) { // no movement
			
		}
		direction = 4;
		
		
		if(validateMove(this.x, this.y)) {
			Main.display.remove(Main.display.gp);
			Main.display.gp = new GamePanel(this.x, this.y);
			Main.display.add(Main.display.gp, BorderLayout.WEST);
			Main.display.gp.revalidate();
			Main.display.gp.repaint();
		} else {
			this.x = initX;
			this.y = initY;
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
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setDirection(int value) {
		this.direction = value;
	}
	
}
