package Tests;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import GUI.ArenaPanel;
import Game.Main;

public class GamePanelTest extends JFrame {
	public GamePanelTest() {
		super("Rogers Revenge IV");
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		setVisible(true);
		
		ArenaPanel p1 = new ArenaPanel(Main.enemy);
		p1.setSize(832, 768);
		p1.setPreferredSize(new Dimension(832, 768));
		p1.setMinimumSize(new Dimension(832, 768));
		add(p1, BorderLayout.WEST);
		p1.setVisible(true);
		p1.revalidate();
		p1.repaint();
	
	}
	public static void main(String[] args) {
		GamePanelTest test = new GamePanelTest();
		
	}
}
