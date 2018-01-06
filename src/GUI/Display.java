package GUI;

import java.awt.BorderLayout;
import java.awt.KeyboardFocusManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.Main;
import IO.KeyInput;

public class Display extends JFrame {
	
	public JPanel gp;
	public JPanel cp;
	
	public Display() {
		super("Rogers Revenge IV");
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		setVisible(true);
		gp = new GamePanel(Main.roger.x, Main.roger.y);
		
		cp = new ControlPanel();
		add(gp, BorderLayout.WEST);
		add(cp, BorderLayout.EAST);
		gp.setVisible(true);
		revalidate();
		repaint();
		
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		KeyInput keyinput = new KeyInput();
		manager.addKeyEventDispatcher(keyinput);
	}
}
