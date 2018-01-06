package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ExperienceBar extends GenericBar {
	
	public ExperienceBar() {
		super("XP", Color.green);
	}
	public void setXP(int experience) {
		this.updateValue(experience);
	}
	public int getXP() {
		return this.value;
	}
}
