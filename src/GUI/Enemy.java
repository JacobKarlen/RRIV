package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.Main;
import Game.UtilityFunctions;




public class Enemy extends Character {
	

	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));

	private int maximumHP, hp;
	
	private JLabel levelLabel = new JLabel("");
	public int x, y;
	
	public Enemy(int xPos, int yPos, int lvl, String enemyName) {
		super(xPos, yPos, lvl, enemyName, 500 * lvl, 500 * lvl);
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setIcon(left);
		levelLabel.setText("LVL " + lvl);
		levelLabel.setVisible(true);
		levelLabel.setPreferredSize(new Dimension(64, 8));
		levelLabel.setForeground(Color.white);
		//levelLabel.setOpaque(true);
		this.add(levelLabel);
		x = xPos;
		y = yPos;
		Main.enemies.add(this);
	}
	public void move() {
		int tx = this.x;
		int ty = this.y;
		
		int range = 6; 
		// checking 13x13 (2*range+1)(2*range+1) area arround enemy to detect player, if seen, move towards it
		
		int direction = 0;
		Random rand = new Random();
		
		if(Main.roger.x == this.x && Main.roger.y == this.y) { // enemy and player in same coords
			direction = 4;
		} else if((Main.roger.x <= this.x + range && Main.roger.x >= this.x) && (Main.roger.y <= this.y + range && Main.roger.y >= this.y)) { // within botton right corner
			if(Main.roger.x == this.x) { 
				direction = 2; // down
			} else if(Main.roger.y == this.y) {
				direction = 1; // right
			} else {
				int temp = rand.nextInt(2);
				if(temp == 0) {
					direction = 2; // down
				} else {
					direction = 1; // right
				}
			}
		} else if((Main.roger.x <= this.x + range && Main.roger.x >= this.x) && (Main.roger.y <= this.y && Main.roger.y >= this.y - range)) { // within top right corner
			if(Main.roger.x == this.x) {
				direction = 0; //up
			} else if(Main.roger.y == this.y) {
				direction = 1; // right
			} else {
				int temp = rand.nextInt(2);
				if(temp == 0) {
					direction = 0; // up
				} else {
					direction = 1; // right
				}
			}
		} else if((Main.roger.x <= this.x && Main.roger.x >= this.x - range) && (Main.roger.y <= this.y + range && Main.roger.y >= this.y)) { // within bottom left corner
			if(Main.roger.x == this.x) {
				direction = 2; // down
			} else if(Main.roger.y == this.y) {
				direction = 3; // left
			} else {
				int temp = rand.nextInt(2);
				if(temp == 0) {
					direction = 2; // down
				} else {
					direction = 3; // left
				}
			}
		} else if((Main.roger.x <= this.x && Main.roger.x >= this.x - range) && (Main.roger.y <= this.y && Main.roger.y >= this.y - range)) { // within top left corner
			if(Main.roger.x == this.x) {
				direction = 0; // up
			} else if(Main.roger.y == this.y) {
				direction = 3; // left
			} else {
				int temp = rand.nextInt(2);
				if(temp == 0) {
					direction = 0; // up
				} else {
					direction = 3; // left
				}
			}
		} else {
			direction = rand.nextInt(5);
		}
		
		if(direction == 0) {
			this.movingUp();
			ty--;
		} else if(direction == 1) {
			this.movingRight();
			tx++;
		} else if(direction == 2 ){
			this.movingDown();
			ty++;
		} else if(direction == 3) {
			this.movingLeft();
			tx--;
		} else {
			
		}
		
	
		if(UtilityFunctions.validateMove(tx, ty)) {
			this.x = tx;
			this.y = ty;
			Main.display.remove(Main.display.gp);
			Main.display.gp = new GamePanel(Main.roger.x, Main.roger.y);
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
	public void setHealth(int newHP) {
		this.hp = newHP;
	}
}