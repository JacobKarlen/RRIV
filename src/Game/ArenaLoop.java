package Game;

import java.awt.BorderLayout;

import GUI.ArenaPanel;
import GUI.Enemy;

public class ArenaLoop {
	
	public static void ArenaBattle(Enemy enemy) {
		Main.display.remove(Main.display.gp);
		ArenaPanel panel = new ArenaPanel(enemy);
		Main.display.add(panel, BorderLayout.WEST);
		
		
		Main.display.revalidate();
		Main.display.repaint();
		
		while(true) {

		}
	}
}
