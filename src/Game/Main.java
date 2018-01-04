package Game;

import java.util.ArrayList;
import java.util.List;

import GUI.Display;
import GUI.Enemy;
import GUI.Map;

public class Main {
	
	public static Display display;
	public static List<Enemy> enemies = new ArrayList();
	public static Map map = new Map("/Maps/map1.txt");
	public static Enemy enemy = new Enemy(20,20);
	
	public static void main(String[] args) {
		
		display = new Display();
		
		int counter = 0;
		while(true) {
			counter++;
			if (counter % 10000000 == 0) {	
				GameSettings.roger.move();
			}
			if(counter % 200000000 == 0) {
				for(int i = 0; i < enemies.size(); i++) {
					enemies.get(i).move();
				}
			}
		}
		
	}
}
