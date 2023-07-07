package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame Window = new JFrame();
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.setResizable(false);
		Window.setTitle("2D Adventure");
		
		GamePanel gamePanel = new GamePanel();
		Window.add(gamePanel);
		
		Window.pack();
		
		Window.setLocationRelativeTo(null); // window will be in the middle of the screen
		Window.setVisible(true);
		
		gamePanel.startGameThread();
		
		
	}

}
