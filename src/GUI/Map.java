package GUI;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import Tiles.EdgeTile;
import Tiles.GrassEdgeDown;
import Tiles.GrassEdgeLeft;
import Tiles.GrassEdgeRight;
import Tiles.GrassEdgeUp;
import Tiles.GrassEdgeUpleft;
import Tiles.GrassTile;
import Tiles.GrassTile2;
import Tiles.Tile;

public class Map {
	
	public Tile[][] grid = new Tile[36][39];
	
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
		if(tileID.equals("000")) { // edge-stone tile
			tile = new EdgeTile();
		} else if(tileID.equals("001")) { // grass tile 1
			tile = new GrassTile();
		} else if(tileID.equals("002")) { // grass tile 2
			tile = new GrassTile2();
		} else if(tileID.equals("003")) { // grass edge up
			tile = new GrassEdgeUp();
		} else if(tileID.equals("004")) { // grass edge upright
			//tile = new GrassEdgeUpright();
		} else if(tileID.equals("005")) { // grass edge right
			tile = new GrassEdgeRight();
		} else if(tileID.equals("006")) { // grass edge downright
			//tile = new GrassEdgeDownright();
		} else if(tileID.equals("007")) { // grass edge down
			tile = new GrassEdgeDown();
		} else if(tileID.equals("008")) { // grass edge downleft
			//tile = new GrassEdgeDownleft();
		} else if(tileID.equals("009")) { // grass edge left
			tile = new GrassEdgeLeft();
		} else if(tileID.equals("010")) { // grass edge upleft
			tile = new GrassEdgeUpleft();
		}
		return tile;
	}
}

