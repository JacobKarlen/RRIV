package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	
	private JLabel outerContainer = new JLabel();
	private JPanel innerContainer = new JPanel();
	
	private ImageIcon bg;
	public static HealthBar hpBar = new HealthBar();
	public static ExperienceBar xpBar = new ExperienceBar();
	
	public ControlPanel() {
		
		bg = new ImageIcon(this.getClass().getResource("/Images/wood.png"));
		
		setLayout(new BorderLayout());
		setSize(534, 768);
		setMinimumSize(new Dimension(534, 768));
		setVisible(true);
		
		//outer container settings
		outerContainer.setIcon(bg);
		outerContainer.setSize(new Dimension(534, 768));
		outerContainer.setPreferredSize(new Dimension(534, 768));
		outerContainer.setOpaque(false);
		outerContainer.setVisible(true);

		//inner container settings
		innerContainer.setSize(new Dimension(534, 768));
		innerContainer.setPreferredSize(new Dimension(534, 768));
		innerContainer.setVisible(true);
		innerContainer.setOpaque(false);
		
		outerContainer.add(innerContainer);
		innerContainer.add(hpBar);
		innerContainer.add(xpBar);
		
		add(outerContainer);
		
	}
}

