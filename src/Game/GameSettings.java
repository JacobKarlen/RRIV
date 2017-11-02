package Game;

import java.util.ArrayList;

import GUI.Enemy;
import GUI.Roger;

public class GameSettings {
	public static int screen_x = 10;
	public static int screen_y = 20;
	public static String movement = ""; 
	public static Roger roger = new Roger();
	public static ArrayList<Enemy> enemies = new ArrayList<>();
	
	public static void move() {
		if (movement == "") {
			
		} else if (movement == "up") {
			GameSettings.roger.move(GameSettings.screen_x, GameSettings.screen_y-1);
			GameSettings.roger.movingUp();
		} else if(movement == "down") {
			GameSettings.roger.move(GameSettings.screen_x, GameSettings.screen_y+1);
			GameSettings.roger.movingDown();
		} else if(movement == "left") {
			GameSettings.roger.move(GameSettings.screen_x-1, GameSettings.screen_y);
			GameSettings.roger.movingLeft();
		} else if(movement == "right") {
			GameSettings.roger.move(GameSettings.screen_x+1, GameSettings.screen_y);
			GameSettings.roger.movingRight();
		}
		movement = "";
	}
}
