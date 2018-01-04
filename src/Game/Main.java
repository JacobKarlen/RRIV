package Game;

import java.util.ArrayList;
import java.util.List;

import GUI.Display;
import GUI.Enemy;
import GUI.Map;
import GUI.Roger;

public class Main {
	
	public static Display display;
	
	public static Map map = new Map("/Maps/map1.txt");
	public static Roger roger = new Roger(10, 20);
	public static List<Enemy> enemies = new ArrayList<>();
	
	public static void main(String[] args) {
		
		display = new Display();
		Enemy test = new Enemy(10, 20, 20, 20);
		Enemy test2 = new Enemy(15, 20, 20, 20);
		
		int counter = 0;
		while(true) {
			counter++;
			if(counter % 10000000 == 0) {
				roger.move();
				for(int i = 0; i < enemies.size(); i++) {
					if(roger.getX() == enemies.get(i).getX() && roger.getY() == enemies.get(i).getY()) {
						System.out.println("LETS BATTLE!");
						roger.setHealth(roger.getHealth() - 20);
						System.out.println(roger.getHealth());
					}
				}
			} 
			if(counter % 20000000 == 0) {
				for(int i = 0; i < enemies.size(); i++) {
					enemies.get(i).move();
				}
			}
			//System.out.println(counter);
		}
		
	}
}
