package GUI;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import Tiles.*;



public class Map {
	
	public Tile[][] grid = new Tile[72][78];
	
	public Map(String fileName) {
		Scanner sc;
		Scanner lc;
		try {
			sc = new Scanner(new File(this.getClass().getResource(fileName).toURI()));
			//open file from relative filepath using getClass().getResoruce()
			//,then convert to URI that the File constructor requires
			
			for(int y = 0; y < grid.length; y++) {
				String line = sc.nextLine();
				lc = new Scanner(line);
				for(int x = 0; x < grid[0].length; x++) {
					String tileID = lc.next();
					grid[y][x] = getTile(tileID);
				}
			}
			
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} catch (URISyntaxException e2) {
			System.out.println(e2.getMessage());
		}
	}
	private Tile getTile(String tileID) {
		Tile tile = new Tile();

		if(tileID.equals("000")) { // deep water
			tile = new DeepWater();
		} else if(tileID.equals("001")) { // deep-shallow up
			tile = new DeepShallowUp();
		} else if(tileID.equals("002")) { // deep-shallow up right
			tile = new DeepShallowUpRight();
		} else if(tileID.equals("003")) { // deep-shallow right
			tile = new DeepShallowRight();
		} else if(tileID.equals("004")) { // deep-shallow down right
			tile = new DeepShallowDownRight();
		} else if(tileID.equals("005")) { // deep-shallow down
			tile = new DeepShallowDown();
		} else if(tileID.equals("006")) { // deep-shallow down left
			tile = new DeepShallowDownLeft();
		} else if(tileID.equals("007")) { // deep-shallow left
			tile = new DeepShallowLeft();
		} else if(tileID.equals("008")) { // deep-shallow up left
			tile = new DeepShallowUpLeft();
		} else if(tileID.equals("009")) { // shallow water
			tile = new ShallowWater();
		} else if(tileID.equals("010")) { // beach up
			tile = new BeachUp();
		} else if(tileID.equals("011")) { // beach up right
			tile = new BeachUpRight();
		} else if(tileID.equals("012")) { // beach right
			tile = new BeachRight();
		} else if(tileID.equals("013")) { // beach down right
			tile = new BeachDownRight();
		} else if(tileID.equals("014")) { // beach down
			tile = new BeachDown();
		} else if(tileID.equals("015")) { // beach down left
			tile = new BeachDownLeft();
		} else if(tileID.equals("016")) { // beach left
			tile = new BeachLeft();
		} else if(tileID.equals("017")) { // beach up left
			tile = new BeachUpLeft();
		} else if(tileID.equals("018")) { // grass 1
			tile = new GrassTile();
		} else if(tileID.equals("019")) { // grass 2
			tile = new GrassTile2();
		}
		
		return tile;
	}
}

