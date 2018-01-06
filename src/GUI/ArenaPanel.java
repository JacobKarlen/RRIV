package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game.Main;

public class ArenaPanel extends JPanel {
	
	private int[] enemyHealthLevel = {100, 200, 300};
	
	private JPanel playerPanel,
					enemyPanel,
					vsPanel,
					controlPanel;
	
	private class FighterPanel extends JPanel {
		
		private JLabel fighterName = new JLabel();
		private HealthBar fighterHP = new HealthBar();
		private EnergyBar fighterEnergy = new EnergyBar();
		
		private FighterPanel(Object fighter) {
			
			setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
			
			setSize(new Dimension(300, 588));
			setPreferredSize(new Dimension(300, 588));
			setVisible(true);
			setBackground(Color.blue);
			setOpaque(true);
		
			
			//fighterName.setText(fighter.getName() + ", " + fighter.getLevel()); // the real one
			fighterName.setText("Roger, lvl 3");
			fighterName.setBackground(Color.lightGray);
			fighterName.setPreferredSize(new Dimension(300, 30));
			fighterName.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			fighterName.setFont(new Font("Arial", Font.PLAIN, 22));
			fighterName.setHorizontalAlignment(0);
			fighterName.setForeground(Color.black);
			fighterName.setOpaque(true);
			
			add(fighterName);
			fighterHP = new HealthBar();
			//playerHP.updateHealth(fighter.getHealth()); // the real one
			fighterHP.setHP(250);
			//fighterHP.setPreferredSize(new Dimension(300, 30));
			add(fighterHP);
			fighterEnergy = new EnergyBar();
			add(fighterEnergy);
		}
	}
	
	private class VsPanel extends JPanel {
		
		private JLabel vsLabel = new JLabel("Battle Arena");
		
		private VsPanel() {
			setSize(new Dimension(232, 588));
			setPreferredSize(new Dimension(232, 588));
			setVisible(true);
			setOpaque(true);
			setBackground(Color.gray);
			vsLabel.setFont(new Font("Arial", Font.BOLD, 35));
			add(vsLabel);
		}
	}
	
	private class ControlPanel extends JPanel {
		
		private ControlPanel() {
			setPreferredSize(new Dimension(832, 180));
			setVisible(true);
			setOpaque(true);
			setBackground(Color.green);
		}
	}
	
	public ArenaPanel(Enemy enemy) {
		// main container panel
		setSize(832, 768);
		setPreferredSize(new Dimension(832, 768));
		setMaximumSize(new Dimension(832, 768));
		setMinimumSize(new Dimension(832, 768));
		setVisible(true);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		playerPanel = new FighterPanel(Main.roger);
		
		vsPanel = new VsPanel();
		
		enemyPanel = new FighterPanel(enemy);
		
		controlPanel = new ControlPanel();
		
		
		add(playerPanel);
		add(vsPanel);
		add(enemyPanel);
		add(controlPanel);
		
		
	}
}