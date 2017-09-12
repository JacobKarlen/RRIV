package Tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import GUI.Map;

public class MapTest {
	public static void main(String[] args) {
		//printMap();
		//getTileTest();
		fileReadTest();
	}
	public static void printMap() {
		Map map = new Map("D:\\programmering\\workspace\\Rogers Revenge IV\\bin\\Maps\\map1.txt");
		for(int i = 0; i < map.grid.length; i++) {
			for(int j = 0; j < map.grid[0].length; j++) {
				System.out.println(map.grid[i][j]);
			}
		}
	}
	public static void getTileTest() {
		String id = "001";
		System.out.println(Map.getTile(id));
	}
	public static void fileReadTest() {
		String fileName = "D:\\programmering\\workspace\\Rogers Revenge IV\\bin\\Maps\\map1.txt";
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			String line = sc.nextLine();
			System.out.println(line);
			System.out.println("gteage");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		URL path = ClassLoader.getSystemResource("D:\\programmering\\workspace\\Rogers Revenge IV\\bin\\Maps\\map.txt");
		if(path == null) {
			System.out.println("Oh fuch");
		}
		try {
			File f = new File(path.toURI());
		
		
		} catch (Exception e) {
			System.out.println("HELVETE");
		}
		}
}
