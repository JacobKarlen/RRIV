package GUI;

import java.awt.Color;


public class HealthBar extends GenericBar {
	
	public HealthBar(int hp, int max) {
		super("HP", Color.red);
		this.setHP(hp);
		this.setMaximum(max);
		this.updateValue(hp);
		revalidate();
		repaint();
	}
	public void setHP(int health) {
		this.updateValue(health);
	}
	public int getHP() {
		return this.value;
	}
	public void setMaximumHP(int max, int hp) {
		this.setMaximum(max);
		this.updateValue(hp);
	}
}
