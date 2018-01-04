package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import Game.Main;

public class HealthBar extends JPanel {
	
	private JProgressBar bar = new JProgressBar();
	public int hp;
	
	public HealthBar() {
		setSize(534, 768);
		setMaximumSize(new Dimension(534, 768));
		setVisible(true);
		setOpaque(false);
		
		hp = 250;
		bar.setMinimum(0);
		bar.setMaximum(500);
		bar.setValue(hp);
		bar.setForeground(Color.RED);
		bar.setBackground(Color.LIGHT_GRAY);
		
		bar.setMinimumSize(new Dimension(534, 30));
		bar.setPreferredSize(new Dimension(500, 30));
		bar.setStringPainted(true);
		bar.setVisible(true);
		bar.setOpaque(true);
		bar.setFont(new Font("SansSerif", Font.BOLD, 18));
		updateHealth(hp);
		add(bar);
		
	}
	public void updateHealth(int health) {
		if(health >= bar.getMinimum() && health <= bar.getMaximum()) {
			hp = health;
			bar.setValue(hp);
			String s = bar.getValue() + " / " + bar.getMaximum() + " HP";
			bar.setString(s);
			bar.setStringPainted(true);
			bar.revalidate();
			bar.repaint();
		}
	}
	public int getHealth() {
		return hp;
	}
}
