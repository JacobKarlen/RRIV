package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class GenericBar extends JPanel {
	
	private JProgressBar bar = new JProgressBar();
	public int value;
	private String unit;
	
	public GenericBar(String unitValue, Color color) {
		setSize(534, 768);
		setMaximumSize(new Dimension(534, 768));
		setVisible(true);
		setOpaque(false);
		
		this.unit = unitValue;
		this.value = 250;
		bar.setMinimum(0);
		bar.setMaximum(500);
		bar.setValue(value);
		bar.setForeground(color);
		bar.setBackground(Color.LIGHT_GRAY);
		
		bar.setMinimumSize(new Dimension(534, 30));
		bar.setPreferredSize(new Dimension(500, 30));

		bar.setStringPainted(true);
		bar.setVisible(true);
		bar.setOpaque(true);
		bar.setFont(new Font("SansSerif", Font.BOLD, 18));
		updateValue(value);
		add(bar);
		
	}
	public void updateValue(int newValue) {
		if(newValue > bar.getMaximum()) {
			this.value = bar.getMaximum();
		} else if(newValue >= bar.getMinimum()) {
			this.value = newValue;
		}
		bar.setValue(this.value);
		String s = bar.getValue() + " / " + bar.getMaximum() + " " + this.unit;
		bar.setString(s);
		bar.setStringPainted(true);

		bar.revalidate();
		bar.repaint();
	}
	public int getValue() {
		return this.value;
	}
}
