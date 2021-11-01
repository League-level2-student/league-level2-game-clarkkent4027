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
		L1 = new JButton("1");
		L2 = new JButton("2");
		L3 = new JButton("3");
		L4 = new JButton("4");
		L5 = new JButton("5");
		L6 = new JButton("6");
		L7 = new JButton("7");
		L8 = new JButton("8");
		RETURN = new JButton("RETURN");
		score = new JLabel(panel.points + " points");
		panel.setLayout(null);
		button1.setBounds(120, 400, 200, 100);
		button2.setBounds(370, 400, 200, 100);
		L1.setBounds(100, 200, 50, 50);
		L2.setBounds(200, 200, 50, 50);
		L3.setBounds(300, 200, 50, 50);
		L4.setBounds(400, 200, 50, 50);
		L5.setBounds(500, 200, 50, 50);
		L6.setBounds(600, 200, 50, 50);
		L7.setBounds(100, 300, 50, 50);
		L8.setBounds(200, 300, 50, 50);
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
					"Play levels and unscramble the words to get points! Earn 35 points to win! ");
			panel.currentState = panel.MENU;
			panel.add(button1);
			panel.add(button2);
			frame.requestFocus();
		} else if (e.getSource() == L1) {
			panel.currentState = panel.L1;
			panel.add(new Level1());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L2) {
			panel.currentState = panel.L2;
			panel.add(new Level2());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L3) {
			panel.currentState = panel.L3;
			panel.add(new Level3());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L4) {
			panel.currentState = panel.L4;
			panel.add(new Level4());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L5) {
			panel.currentState = panel.L5;
			panel.add(new Level5());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L6) {
			panel.currentState = panel.L6;
			panel.add(new Level6());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L7) {
			panel.currentState = panel.L7;
			panel.add(new Level7());
			panel.add(score);
			panel.add(RETURN);
			frame.requestFocus();
		} else if (e.getSource() == L8) {
			panel.currentState = panel.L8;
			panel.add(new Level8());
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
		}

		score.setText(panel.points + " points");

		frame.pack();
	}
}
