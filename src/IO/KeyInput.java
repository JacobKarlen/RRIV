package IO;

import java.awt.BorderLayout;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

import GUI.Display;
import GUI.GamePanel;
import Game.GameSettings;

import Game.Main;

public class KeyInput implements KeyEventDispatcher {
		@Override
		public boolean dispatchKeyEvent(KeyEvent e) {
			if(e.getID() == KeyEvent.KEY_PRESSED) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) { // move left
					Main.roger.direction = 3;
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) { // move right
					Main.roger.direction = 1;
				} else if(e.getKeyCode() == KeyEvent.VK_UP) { // move up
					Main.roger.direction = 0;
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) { // move down
					Main.roger.direction = 2;
				}
				
			}
			return false;
		}
	}
