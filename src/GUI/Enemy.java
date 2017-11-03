package GUI;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.Main;

public class Enemy extends JLabel{
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	private int x, y;
	
	public Enemy(int xPos, int yPos, int type, int lvl) {
		setIcon(left);
		Main.enemies.add(this);
		this.x = xPos;
		this.y = yPos;
		
	}
	
	public void move() {
		Random rand = new Random();
		int randDir = rand.nextInt(5);
		
		if(randDir == 0) { // up 
			this.movingUp();
			this.y--;
		} else if(randDir == 1) { // right
			this.movingRight();
			this.x++;
		} else if(randDir == 2) { // down
			this.movingDown();
			this.y++;
		} else if(randDir == 3) { // left
			this.movingLeft();
			this.x--;
		} else { // no movement
			
		}
		
	}
	public int getY() {
		return this.y;
	}
	public int getX() {
		return this.x;
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
}
