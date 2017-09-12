package Game;

import GUI.Display;
import GUI.Map;
import Game.GameSettings;

public class Main {
	
	public static Display display;
	
	public static Map map = new Map("/Maps/map1.txt");
	
	public static void main(String[] args) {
		
		display = new Display();
		
		int counter = 0;
		while(true) {
			counter++;
			if (counter == 1000) {
				GameSettings.move();
				counter = 0;
			}
			System.out.println(counter);
		}
		
	}
}
