package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import entity.Player;


public class GamePanel extends JPanel implements Runnable{
	final int originalTileSize = 16;
	final int scale = 3;
	final int tileSize = originalTileSize*scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	int FPS = 60; // draw 60 times every second
	
	KeyHandler keyH = new KeyHandler();
	
	Thread gameThread; // Thread class and method Runnable parallel
	
	Player player = new Player(this, keyH);
	
	
// set Player's default position
	int playerX = 100;
	int playerY = 100;
	int playerSpeed =4;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
		
	}


	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
		
	}

	  @Override
	  public void run() {
//		// TODO Auto-generated method stub
		double drawInterval = 1000000000/FPS; // hier nanoseconds  0.01666 seconds, every frame takes 0.01666 s
//		// FPS 60 FPS we update and draw 60 times per second
		double nextDrawTime = System.nanoTime() + drawInterval;
//	
	while (gameThread != null) {
			long currentTime = System.nanoTime();
			//System.out.println("current Time" + currentTime);
//			//System.out.println("The game loop is running.");
//			
			update();
		
			repaint();
//		
//		
//			
//			
			try {
			double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime/1000000;  // 1second = 1000 milliseconds, 1second = 1000 000 000 nanoseconds
				if (remainingTime < 0) {
					remainingTime = 0;
			}
			
				Thread.sleep((long)remainingTime);
				nextDrawTime += drawInterval;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			

	}
	
	}
	
	
	
	public void update() {
	
		if(keyH.upPressed == true) {
			playerY -= playerSpeed;
		//playerY = playerY-playerSpeed;
		}
		else if(keyH.downPressed == true) {
			playerY += playerSpeed;
		}
		
		else if(keyH.leftPressed == true) {
			playerX -= playerSpeed;
		}
		
		else if(keyH.rightPressed == true) {
			playerX += playerSpeed;
		}
		
		}
	
	
	
	
	public void paintComponent(Graphics g) {
		// Graphics g is a class like pencil or pen used to draw
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.white);
		g2.fillRect(playerX,playerY,tileSize,tileSize);
		g2.dispose();
		//save memory
	}



		
	}
	

