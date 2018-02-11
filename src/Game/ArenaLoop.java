package Game;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import GUI.ArenaPanel;
import GUI.Enemy;

public class ArenaLoop {
	
	public static boolean turn = true;
	
	public static void ArenaBattle(Enemy enemy) {
		JPanel gp = Main.display.gp;
		
		Main.display.remove(Main.display.gp);
		ArenaPanel panel = new ArenaPanel(enemy);
		Main.display.add(panel, BorderLayout.WEST);
		
		
		Main.display.revalidate();
		Main.display.repaint();
		
		while(true) {

		}
		
	}
}
