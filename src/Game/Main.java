package Game;

import GUI.Display;
import GUI.Enemy;
import GUI.Map;

public class Main {
	
	public static Display display;
	
	public static Map map = new Map("/Maps/map1.txt");
	
	public static void main(String[] args) {
		
		display = new Display();
		Enemy test = new Enemy(10, 20, 20, 20);
		
		int counter = 0;
		while(true) {
			counter++;
			if (counter % 1000 == 0) {
				GameSettings.move();
			} 
			if (counter % 10000000 == 0) {
				for(int i = 0; i < GameSettings.enemies.size(); i++) {
					GameSettings.enemies.get(i).move();
				}
			}
			//System.out.println(counter);
		}
		
	}
}
