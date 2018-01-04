package Game;

public class UtilityFunctions {
	public static boolean validateMove(int x, int y) {
		if(x >= 0 && y >= 0) { // check valid top-left corner
			if(y + 11 < Main.map.grid.length && x + 12 < Main.map.grid[0].length) { // check valid bot-right corner
				if(!Main.map.grid[y + 6][x + 6].collision) {
					return true;
				}
			}
		}
		return false;
	}
}
