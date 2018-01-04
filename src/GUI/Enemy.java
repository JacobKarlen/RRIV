package GUI;

import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.GameSettings;
import Game.Main;
import Game.UtilityFunctions;


public class Enemy extends JLabel {
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));

	public int x, y;
	
	public Enemy(int xPos, int yPos) {
		setIcon(left);
		this.x = xPos;
		this.y = yPos;
		Main.enemies.add(this);
	}
	public void move() {
		int tx = this.x;
		int ty = this.y;
		
		Random rand = new Random();
		int randDir = rand.nextInt(5);
		if(randDir == 0) {
			this.movingUp();
			ty--;
		} else if(randDir == 1) {
			this.movingRight();
			tx++;
		} else if(randDir == 2 ){
			this.movingDown();
			ty++;
		} else if(randDir == 3) {
			this.movingLeft();
			tx--;
		} else {
			
		}
		
	
		if(UtilityFunctions.validateMove(tx, ty)) {
				this.x = tx;
				this.y = ty;
				Main.display.remove(Main.display.gp);
				Main.display.gp = new GamePanel(GameSettings.roger.x, GameSettings.roger.y);
				Main.display.add(Main.display.gp, BorderLayout.WEST);
				Main.display.gp.revalidate();
				Main.display.gp.repaint();
			
		} else {
			
		}

	}
	public void movingLeft() {
		setIcon(left);
	}
	public void movingUp() {
		setIcon(up);
	}
	public void movingRight() {
		setIcon(right);
	}
	public void movingDown() {
		setIcon(down);
	}
}