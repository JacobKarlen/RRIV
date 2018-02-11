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
	
	public Character(int xPos, int yPos, int characterLevel, String characterName, int _hp, int _maximumHP) {
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.red),
				this.getBorder()));
		hp = _hp;
		maximumHP = _maximumHP;
		level = characterLevel;
		name = characterName;
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
