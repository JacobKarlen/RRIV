package GUI;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enemy extends JLabel{
	
	ImageIcon left = new ImageIcon(this.getClass().getResource("/Images/RogerLeft.png"));
	ImageIcon right = new ImageIcon(this.getClass().getResource("/Images/RogerRight.png"));
	ImageIcon up = new ImageIcon(this.getClass().getResource("/Images/RogerUp.png"));
	ImageIcon down = new ImageIcon(this.getClass().getResource("/Images/RogerDown.png"));
	
	public Enemy(int xPos, int yPos, int type, int lvl) {
		int x = xPos;
		int y = yPos;
		setIcon(left);
	}
	
	public void move() {
		Random rand = new Random();
		int randDir = rand.nextInt(4);
		
	}
}
