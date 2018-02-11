package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

class FighterPanel extends JPanel {
	
	private JLabel fighterName = new JLabel();
	private HealthBar fighterHP;
	private EnergyBar fighterEnergy = new EnergyBar();
	private Character _fighter;
	
	public FighterPanel(Character fighter) {
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		setSize(new Dimension(300, 588));
		setPreferredSize(new Dimension(300, 588));
		setVisible(true);
		setBackground(Color.black);
		setOpaque(true);
		
		_fighter = fighter;
		fighterName.setText(fighter.getName() + ", " + fighter.getLevel()); // the real one
		fighterName.setBackground(Color.lightGray);
		fighterName.setPreferredSize(new Dimension(300, 30));
		fighterName.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		fighterName.setFont(new Font("Arial", Font.PLAIN, 22));
		fighterName.setHorizontalAlignment(0);
		fighterName.setForeground(Color.black);
		fighterName.setOpaque(true);
		
		add(fighterName);
		fighterHP = new HealthBar(fighter.getHP(), fighter.getMaximumHP());
		fighterHP.updateValue(fighter.getHP());
		add(fighterHP);
		fighterEnergy = new EnergyBar();
		add(fighterEnergy);
	}
	public void updateHP(int dmg) {
		_fighter.setHP(_fighter.getHP() - dmg);
		fighterHP.setHP(_fighter.getHP());
		fighterHP.revalidate();
		fighterHP.repaint();
	}
	public void updateEnergy(int gain) {
		fighterEnergy.setEnergy(fighterEnergy.getEnergy() + gain);
		fighterEnergy.revalidate();
		fighterEnergy.repaint();
	}
}