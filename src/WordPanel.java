import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author Kalel Moorjani
 *
 */
public class WordPanel extends JPanel implements ActionListener, KeyListener, MouseListener {
	final int MENU = 0;
	final int SELECT = 1;
	final int L1 = 2;
	final int L2 = 3;
	final int L3 = 4;
	final int L4 = 5;
	final int L5 = 6;
	final int L6 = 7;
	final int L7 = 8;
	final int L8 = 9;
	int points = 0;
	int currentState = MENU;
	Timer frameDraw;
	public BufferedImage image;

	void startGame() {
		int currentState = MENU;
	}

	void updateMenuState() {
	}

	void updateSelectState() {
	}

	void updatel1State() {
	}

	void updatel2State() {
	}

	void updatel3State() {
	}

	void updatel4State() {
	}

	void updatel5State() {
	}

	void updatel6State() {
	}

	void updatel7State() {
	}
	
	void updatel8State() {
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("WORD SCRAMBLE!", 145, 200);
	}

	void drawSelectState(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Press any level to play it!", 85, 140);
	}

	void drawl1State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 1 : SEA ANIMALS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("R A S H K", 70, 220);
		g.drawString("F O W L S H I N C", 70, 340);
		g.drawString("T E A M E A N", 70, 460);

	}

	void drawl2State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 2 : STAR WARS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("N I N K A A", 70, 220);
		g.drawString("C E M A  D N I U W", 70, 340);
		g.drawString("N J Y  S O R E", 70, 460);
	}

	void drawl3State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 3 : FLOWERS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Y A S I D", 70, 220);
		g.drawString("T O N A R N I A C", 70, 340);
		g.drawString("O M A N G A I L", 70, 460);
	}

	void drawl4State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 4 : COLORS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("R E A U Z", 70, 220);
		g.drawString("M A S O N L", 70, 340);
		g.drawString("D U N Y G R U B", 70, 460);
	}

	void drawl5State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 5 : DISNEY MOVIES", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("L A I N D A D", 70, 220);
		g.drawString("T O P A Z O I O", 70, 340);
		g.drawString("D A R W O N", 70, 460);
	}

	void drawl6State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 6 : INSECTS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("N A S T I M", 70, 220);
		g.drawString("G L A D B U Y", 70, 340);
		g.drawString("M I T T E R E", 70, 460);
	}

	void drawl7State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 7 : INSTRUMENTS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("O L I V A", 70, 220);
		g.drawString("M O O N B E R T", 70, 340);
		g.drawString("B A M I N E T O U R", 70, 460);
	}
	
	void drawl8State(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 8 : ???", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("O L I V A", 70, 220);
		g.drawString("M O O N B E R T", 70, 340);
		g.drawString("B A M I N E T O U R", 70, 460);
	}

	Font titleFont;

	WordPanel() {
		titleFont = new Font("Malgun Gothic", Font.BOLD, 45);
		frameDraw = new Timer(1000 / 60, this);
		frameDraw.start();
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
		} else if (currentState == L4) {
			drawl4State(g);
		} else if (currentState == L5) {
			drawl5State(g);
		} else if (currentState == L6) {
			drawl6State(g);
		} else if (currentState == L7) {
			drawl7State(g);
		} else if (currentState == L8) {
			drawl8State(g);
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
		} else if (currentState == L4) {
			updatel4State();
		} else if (currentState == L5) {
			updatel5State();
		} else if (currentState == L6) {
			updatel6State();
		} else if (currentState == L7) {
			updatel7State();
		} else if (currentState == L8) {
			updatel8State();
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
		if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			System.out.println(points);
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
