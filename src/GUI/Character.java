package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.Main;
import Game.UtilityFunctions;


public class Character extends JLabel {
	
	public int x, y;
	public int direction = 4;
	private int level;
	private String name;
	
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	public Character(int xPos, int yPos, int characterLevel, String characterName) {
		setIcon(left);
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.red),
				this.getBorder()));
		this.x = xPos;
		this.y = yPos;
		this.level = characterLevel;
		this.name = characterName;
	}
	
	public void move() {
		int tx = this.x;
		int ty = this.y;
		
		if (direction == 0) { // up
			ty--;
			movingUp();
		} else if (direction == 1) { // right
			tx++;
			movingRight();
		} else if(direction == 2) { // down
			ty++;
			movingDown();
		} else if(direction == 3) { // left
			tx--;
			movingLeft();
		} else if(direction == 4) { // no movement
			
		}
		direction = 4;
		
		if(UtilityFunctions.validateMove(tx, ty)) {
			this.x = tx;
			this.y = ty;

			Main.display.remove(Main.display.gp);
			Main.display.gp = new GamePanel(this.x, this.y);
			Main.display.add(Main.display.gp, BorderLayout.WEST);
			Main.display.gp.revalidate();
			Main.display.gp.repaint();
		} else {
			
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
		ControlPanel.hpBar.setHP(hp);
	}
	public int getHealth() {
		return ControlPanel.hpBar.getHP();
	}
	public int getLevel() {
		return this.level;
	}
	public String getName() {
		return this.name;
	}
}
