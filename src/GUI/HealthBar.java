package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class HealthBar extends GenericBar {
	
	public HealthBar() {
		super("HP", Color.red);
	}
	public void setHP(int health) {
		this.updateValue(health);
	}
	public int getHP() {
		return this.value;
	}
}
