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
	
	private JLabel container = new JLabel();
	private ImageIcon bg;
	
	public ControlPanel() {
		
		bg = new ImageIcon(this.getClass().getResource("/Images/wood.png"));
		
		setLayout(new BorderLayout());
		setSize(534, 768);
		setMinimumSize(new Dimension(534, 768));
		setVisible(true);
		
		container.setIcon(bg);
		container.setSize(new Dimension(534, 768));
		container.setPreferredSize(new Dimension(534, 768));
		container.setOpaque(false);
		container.setVisible(true);
		
		add(container);
		
		HealthBar healthBar = new HealthBar();
		container.add(healthBar);
		
	}
}
