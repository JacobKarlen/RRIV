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
	private int hp;
	private int maximumHP;
	
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	public Character(int xPos, int yPos, int characterLevel, String characterName, int hp, int maximumHP) {
		setIcon(left);
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.red),
				this.getBorder()));
		this.hp = hp;
		this.maximumHP = maximumHP;
		level = characterLevel;
		name = characterName;
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
	public int getLevel() {
		return level;
	}
	public String getName() {
		return name;
	}
	public int getHP() {
		//return ControlPanel.hpBar.getHP();
		return this.hp;
	}
	public void setHP(int newHP) {
		hp = newHP;
	}
	public int getMaximumHP() {
		return maximumHP;
	}
	
}
