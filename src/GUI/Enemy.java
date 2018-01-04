package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import Game.Main;

public class Enemy extends Roger {
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	private int x, y;
	
	public Enemy(int xPos, int yPos, int type, int lvl) {
		super(xPos, yPos);
		setIcon(left);
		setVisible(true);
		Main.enemies.add(this);
	}
	
	public void move() {
		int initX = this.x, initY = this.y;
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
		if(super.validateMove(this.x, this.y)) {
			Main.display.remove(Main.display.gp);
			Main.display.gp = new GamePanel(Main.roger.getX(), Main.roger.getY());
			Main.display.add(Main.display.gp, BorderLayout.WEST);
			Main.display.gp.revalidate();
			Main.display.gp.repaint();
		} else {
			y = initY;
			x = initX;
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
