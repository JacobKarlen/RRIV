package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game.ArenaLoop;
import Game.Main;

public class ArenaPanel extends JPanel {
	
	private int[] enemyHealthLevel = {100, 200, 300};
	
	private static JPanel vsPanel,
					controlPanel;
	
	private static FighterPanel playerPanel, enemyPanel;
	
	private static Enemy enemy;
	
	public JButton basic, block, special, ultra;
	
	
	
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
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(ArenaLoop.turn) {
				if(e.getSource() == basic) {
					useBasic();
				} else if(e.getSource() == block) {
					useBlock();
				} else if(e.getSource() == special) {
					useSpecial();
				} else if(e.getSource() == ultra) {
					useUltra();
				}
				//ArenaLoop.turn = !ArenaLoop.turn;
			}
		}
	}
	
	private ButtonListener BL = new ButtonListener();
	
	private class ControlPanel extends JPanel {
		
		private int playerLevel = Main.roger.getLevel();
		{
		 basic = new JButton("<html><center>" + "Basic Attack (Deal " + playerLevel * 15 + " damage, restore 50 energy.)" + "</center></html>");
		 block = new JButton("<html><center>"+ "Shield Block (Block next attack, restore 50 energy)" + "</center></html>");
		 special= new JButton("<html><center>" + "Special Attack (Deal " + playerLevel * 50 + "-" + playerLevel * 100 + " damage, use 150 energy)" + "</center></html>");
		 ultra = new JButton("<html><center>" + "Ultra Attack (Deal " + playerLevel * 150 + "-" + playerLevel * 300 + " damage, use 500 energy)" + "</center></html>");
		}
		private ControlPanel() {
			setPreferredSize(new Dimension(832, 180));
			setVisible(true);
			setOpaque(true);
			setBackground(Color.green);
			
			add(basic);
			basic.setPreferredSize(new Dimension(140, 80));
			basic.addActionListener(BL);
			
			add(block);
			block.setPreferredSize(new Dimension(140, 80));
			block.addActionListener(BL);
			
			add(special);
			special.setPreferredSize(new Dimension(140, 80));
			special.addActionListener(BL);
			
			add(ultra);
			ultra.setPreferredSize(new Dimension(140, 80));
			ultra.addActionListener(BL);
		}
	}
	
	public ArenaPanel(Enemy _enemy) {
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
		
		enemy = _enemy;
		
		enemyPanel = new FighterPanel(enemy);
		
		controlPanel = new ControlPanel();	
		
		add(playerPanel);
		add(vsPanel);
		add(enemyPanel);
		add(controlPanel);
	}
	public static void useBasic() {
		enemyPanel.updateHP(Main.roger.getLevel() * 15);
		playerPanel.updateEnergy(50);
	}
	public static void useBlock() {
		
	}
	public static void useSpecial() {
		
	}
	public static void useUltra() {
		
	}
}
