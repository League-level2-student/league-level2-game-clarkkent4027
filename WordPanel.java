import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Kalel Moorjani
 *
 */
public class WordPanel extends JPanel implements ActionListener, KeyListener, MouseListener {
	ObjectManager OM;
	final int MENU = 0;
	final int SELECT = 1;
	final int L1 = 2;
	final int L2 = 3;
	final int L3 = 4;
	int currentState = MENU;
	public BufferedImage image;

	void startGame() {
	}
	
	void updateMenuState() {
	}
	
	void updateSelecteState() {
	}
	
	void updatel1State() {
	}
	
	void updatel2State() {
	}
	
	void updatel3State() {
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Word Scramble!", 150, 200);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("PRESS 'ENTER' TO START", 130, 450);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("PRESS 'SPACE' FOR MORE INSTRUCTIONS", 50, 500);
	}
	
	void drawSelectState(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Press any level to play it!", 150, 200);
	}
	
	void drawl1State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
	}
	
	void drawl2State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
	}
	
	void drawl3State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
	}
	
	Font titleFont;
	
	WordPanel() {
		titleFont = new Font("Arial", Font.ITALIC, 30);
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == SELECT) {
			drawSelectState(g);
		} else if (currentState == L1) {
			drawl1State(g);
		} else if (currentState == L2) {
			drawl2State(g);
		} else if (currentState == L3) {
			drawl3State(g);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU) {
			updateMenuState();
		} else if (currentState == SELECT) {
			updateSelectState();
		} else if (currentState == L1) {
			updatel1State();
		} else if (currentState == L2) {
			updatel2State();
		} else if (currentState == L3) {
			updatel3State();
		}
		repaint();

	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				   if (currentState == END) {
				currentState = MENU;
			} else if (currentState == MENU) {
				currentState = GAME;
				startGame();
			} else if (currentState == GAME) {
				currentState = END;
				alienSpawn.stop();
			}
		}
	}
		
		

	
	
	}

}
