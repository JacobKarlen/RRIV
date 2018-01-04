package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ExperienceBar extends JPanel {
	
	private JProgressBar bar = new JProgressBar();
	public int xp;
	
	public ExperienceBar() {
		setSize(534, 768);
		setMaximumSize(new Dimension(534, 768));
		setVisible(true);
		setOpaque(false);
		
		xp = 250;
		bar.setMinimum(0);
		bar.setMaximum(500);
		bar.setValue(xp);
		bar.setForeground(Color.GREEN);
		bar.setBackground(Color.LIGHT_GRAY);
		
		bar.setMinimumSize(new Dimension(534, 30));
		bar.setPreferredSize(new Dimension(500, 30));
		bar.setStringPainted(true);
		bar.setVisible(true);
		bar.setOpaque(true);
		bar.setFont(new Font("SansSerif", Font.BOLD, 18));
		updateExperience(xp);
		add(bar);
		
	}
	public void updateExperience(int experience) {
		if(experience >= bar.getMinimum() && experience <= bar.getMaximum()) {
			xp = experience;
			String s = bar.getValue() + " / " + bar.getMaximum() + " XP";
			bar.setString(s);
			bar.setStringPainted(true);
		}
	}
}



