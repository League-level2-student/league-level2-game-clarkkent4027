
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameHome implements ActionListener {
	JFrame frame;
	WordPanel panel;
	JButton button1;
	JButton button2;
	Level1 lev1;
	Level2 lev2;
	Level3 lev3;
	Level4 lev4;
	Level5 lev5;
	Level6 lev6;
	Level7 lev7;
	Level8 lev8;
	JButton L1;
	JButton L2;
	JButton L3;
	JButton L4;
	JButton L5;
	JButton L6;
	JButton L7;
	JButton L8;
	JButton RETURN;
	public static JLabel score;
	public static final int HEIGHT = 700;
	public static final int WIDTH = 700;

	GameHome() {
		frame = new JFrame();
		panel = new WordPanel();
		button1 = new JButton("PLAY");
		button2 = new JButton("INSTRUCTIONS");
		L1 = new JButton("1 - Sea Animals");
		L2 = new JButton("2 - Star Wars");
		L3 = new JButton("3 - Flowers");
		L4 = new JButton("4 - Colors");
		L5 = new JButton("5 - Disney Movies");
		L6 = new JButton("6 - Insects");
		L7 = new JButton("7 - Holday ");
		L8 = new JButton("8 - MYSTERY??");
		RETURN = new JButton("RETURN");
		score = new JLabel(WordPanel.points + " points");
		panel.setLayout(null);
		button1.setBounds(120, 400, 200, 100);
		button2.setBounds(370, 400, 200, 100);
		L1.setBounds(100, 200, 240, 40);
		L2.setBounds(100, 250, 240, 40);
		L3.setBounds(100, 300, 240, 40);
		L4.setBounds(100, 350, 240, 40);
		L5.setBounds(100, 400, 240, 40);
		L6.setBounds(100, 450, 240, 40);
		L7.setBounds(100, 500, 240, 40);
		L8.setBounds(100, 550, 240, 40);
		RETURN.setBounds(50, 600, 125, 60);
		score.setBounds(625, -100, 250, 250);
		setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		L1.addActionListener(this);
		L2.addActionListener(this);
		L3.addActionListener(this);
		L4.addActionListener(this);
		L5.addActionListener(this);
		L6.addActionListener(this);
		L7.addActionListener(this);
		L8.addActionListener(this);
		RETURN.addActionListener(this);
		panel.setPreferredSize(new Dimension(GameHome.WIDTH, GameHome.HEIGHT));
		frame.addMouseListener(panel);
		frame.addKeyListener(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (frame.getContentPane() != null) {
			frame.remove(panel);
			panel = new WordPanel();
			panel.setLayout(null);
			frame.add(panel);
			panel.setPreferredSize(new Dimension(HEIGHT, WIDTH));
		}
		if (e.getSource() == button1) {
			panel.currentState = panel.SELECT;
			panel.add(L1);
			panel.add(L2);
			panel.add(L3);
			panel.add(L4);
			panel.add(L5);
			panel.add(L6);
			panel.add(L7);
			panel.add(L8);
			panel.add(score);
		} else if (e.getSource() == button2 && panel.currentState == panel.MENU) {
			JOptionPane.showMessageDialog(null,
					"Play levels and unscramble the words to get points! Earn 15 points to win! ");
			panel.currentState = panel.MENU;
			panel.add(button1);
			panel.add(button2);
			frame.requestFocus();
		} else if (e.getSource() == L1) {
			if (lev1 == null) {
				lev1 = new Level1();
			}
			panel.currentState = panel.L1;
			panel.add(lev1);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L2) {
			if (lev2 == null) {
				lev2 = new Level2();
			}
			panel.currentState = panel.L2;
			panel.add(lev2);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L3) {
			if (lev3 == null) {
				lev3 = new Level3();
			}
			panel.currentState = panel.L3;
			panel.add(lev3);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L4) {
			if (lev4 == null) {
				lev4 = new Level4();
			}
			panel.currentState = panel.L4;
			panel.add(lev4);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L5) {
			if (lev5 == null) {
				lev5 = new Level5();
			}
			panel.currentState = panel.L5;
			panel.add(lev5);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L6) {
			if (lev6 == null) {
				lev6 = new Level6();
			}
			panel.currentState = panel.L6;
			panel.add(lev6);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L7) {
			if (lev7 == null) {
				lev7 = new Level7();
			}
			panel.currentState = panel.L7;
			panel.add(lev7);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L8) {
			if (lev8 == null) {
				lev8 = new Level8();
			}
			panel.currentState = panel.L8;
			panel.add(lev8);
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (panel.currentState == panel.SELECT) {
			panel.add(L1);
			panel.add(L2);
			panel.add(L3);
			panel.add(L4);
			panel.add(L5);
			panel.add(L6);
			panel.add(L7);
			panel.add(L8);
			panel.setSize(700, 700);
			frame.requestFocus();
		} else if (panel.currentState == panel.END) {
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(RETURN);
			panel.remove(score);
			panel.setSize(700, 700);
			frame.requestFocus();

		} else if (e.getSource() == RETURN) {
			panel.currentState = panel.SELECT;
			panel.add(L1);
			panel.add(L2);
			panel.add(L3);
			panel.add(L4);
			panel.add(L5);
			panel.add(L6);
			panel.add(L7);
			panel.add(L8);
			panel.add(score);
		}
		if (WordPanel.points > 14) {
			panel.currentState = panel.END;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(RETURN);
			panel.remove(score);
		}

		score.setText(WordPanel.points + " points");

		frame.pack();
	}
}
