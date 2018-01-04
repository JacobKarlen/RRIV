package IO;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

import GUI.Roger;
import Game.Main;

public class KeyInput implements KeyEventDispatcher {
		@Override
		public boolean dispatchKeyEvent(KeyEvent e) {
			if(e.getID() == KeyEvent.KEY_PRESSED) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) { // move left
					Main.roger.setDirection(3);
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) { // move right
					Main.roger.setDirection(1);
				} else if(e.getKeyCode() == KeyEvent.VK_UP) { // move up
					Main.roger.setDirection(0);
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) { // move down
					Main.roger.setDirection(2);
				}
				
			}
			return false;
		}
	}
