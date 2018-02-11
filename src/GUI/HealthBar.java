package GUI;

import java.awt.Color;


public class HealthBar extends GenericBar {
	
	public HealthBar(int hp, int max) {
		super("HP", Color.red);
		setHP(hp);
		setMaximum(max);
		updateValue(hp);
		revalidate();
		repaint();
	}
	public void setHP(int health) {
		updateValue(health);
	}
	public int getHP() {
		return value;
	}
}
