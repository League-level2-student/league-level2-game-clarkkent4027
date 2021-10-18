import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameHome implements ActionListener {
	JFrame frame;
	WordPanel panel;
	JButton button1;
	JButton button2;
	JButton L1;
	JButton button31;
	JButton button32;
	JButton button33;
	JButton L2;
	JButton button41;
	JButton button42;
	JButton button43;
	JButton L3;
	JButton button51;
	JButton button52;
	JButton button53;
	JButton L4;
	JButton button61;
	JButton button62;
	JButton button63;
	JButton L5;
	JButton button71;
	JButton button72;
	JButton button73;
	JButton L6;
	JButton button81;
	JButton button82;
	JButton button83;
	JButton L7;
	JButton button91;
	JButton button92;
	JButton button93;
	JButton L8;
	JButton button101;
	JButton button102;
	JButton button103;
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
		button31 = new JButton("Click to answer");
		button32 = new JButton("Click to answer");
		button33 = new JButton("Click to answer");
		L2 = new JButton("2");
		button41 = new JButton("Click to answer");
		button42 = new JButton("Click to answer");
		button43 = new JButton("Click to answer");
		L3 = new JButton("3");
		button51 = new JButton("Click to answer");
		button52 = new JButton("Click to answer");
		button53 = new JButton("Click to answer");
		L4 = new JButton("4");
		button61 = new JButton("Click to answer");
		button62 = new JButton("Click to answer");
		button63 = new JButton("Click to answer");
		L5 = new JButton("5");
		button71 = new JButton("Click to answer");
		button72 = new JButton("Click to answer");
		button73 = new JButton("Click to answer");
		L6 = new JButton("6");
		button81 = new JButton("Click to answer");
		button82 = new JButton("Click to answer");
		button83 = new JButton("Click to answer");
		L7 = new JButton("7");
		button91 = new JButton("Click to answer");
		button92 = new JButton("Click to answer");
		button93 = new JButton("Click to answer");
		L8 = new JButton("8");
		button101 = new JButton("Click to answer");
		button102 = new JButton("Click to answer");
		button103 = new JButton("Click to answer");
		RETURN = new JButton("RETURN");
		score = new JLabel(panel.points + " points");
		panel.setLayout(null);
		button1.setBounds(120, 400, 200, 100);
		button2.setBounds(370, 400, 200, 100);
		L1.setBounds(100, 200, 50, 50);
		button31.setBounds(550, 160, 125, 60);
		button32.setBounds(550, 280, 125, 60);
		button33.setBounds(550, 400, 125, 60);
		L2.setBounds(200, 200, 50, 50);
		button41.setBounds(550, 160, 125, 60);
		button42.setBounds(550, 280, 125, 60);
		button43.setBounds(550, 400, 125, 60);
		L3.setBounds(300, 200, 50, 50);
		button51.setBounds(550, 160, 125, 60);
		button52.setBounds(550, 280, 125, 60);
		button53.setBounds(550, 400, 125, 60);
		L4.setBounds(400, 200, 50, 50);
		button61.setBounds(550, 160, 125, 60);
		button62.setBounds(550, 280, 125, 60);
		button63.setBounds(550, 400, 125, 60);
		L5.setBounds(500, 200, 50, 50);
		button71.setBounds(550, 160, 125, 60);
		button72.setBounds(550, 280, 125, 60);
		button73.setBounds(550, 400, 125, 60);
		L6.setBounds(600, 200, 50, 50);
		button81.setBounds(550, 160, 125, 60);
		button82.setBounds(550, 280, 125, 60);
		button83.setBounds(550, 400, 125, 60);
		L7.setBounds(100, 300, 50, 50);
		button91.setBounds(550, 160, 125, 60);
		button92.setBounds(550, 280, 125, 60);
		button93.setBounds(550, 400, 125, 60);
		L8.setBounds(200, 300, 50, 50);
		button101.setBounds(550, 160, 125, 60);
		button102.setBounds(550, 280, 125, 60);
		button103.setBounds(550, 400, 125, 60);
		RETURN.setBounds(50, 600, 125, 60);
		score.setBounds(625, -100, 250, 250);
		setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.remove(L1);
		panel.remove(button31);
		panel.remove(button32);
		panel.remove(button33);
		panel.remove(L2);
		panel.remove(button41);
		panel.remove(button42);
		panel.remove(button43);
		panel.remove(L3);
		panel.remove(button51);
		panel.remove(button52);
		panel.remove(button53);
		panel.remove(L4);
		panel.remove(button61);
		panel.remove(button62);
		panel.remove(button63);
		panel.remove(L5);
		panel.remove(button71);
		panel.remove(button72);
		panel.remove(button73);
		panel.remove(L6);
		panel.remove(button81);
		panel.remove(button82);
		panel.remove(button83);
		panel.remove(L7);
		panel.remove(button91);
		panel.remove(button92);
		panel.remove(button93);
		panel.remove(L8);
		panel.remove(button101);
		panel.remove(button102);
		panel.remove(button103);
		panel.remove(RETURN);
		panel.remove(score);
		button1.addActionListener(this);
		button2.addActionListener(this);
		L1.addActionListener(this);
		button31.addActionListener(this);
		button32.addActionListener(this);
		button33.addActionListener(this);
		L2.addActionListener(this);
		button41.addActionListener(this);
		button42.addActionListener(this);
		button43.addActionListener(this);
		L3.addActionListener(this);
		button51.addActionListener(this);
		button52.addActionListener(this);
		button53.addActionListener(this);
		L4.addActionListener(this);
		button61.addActionListener(this);
		button62.addActionListener(this);
		button63.addActionListener(this);
		L5.addActionListener(this);
		button71.addActionListener(this);
		button72.addActionListener(this);
		button73.addActionListener(this);
		L6.addActionListener(this);
		button81.addActionListener(this);
		button82.addActionListener(this);
		button83.addActionListener(this);
		L7.addActionListener(this);
		button91.addActionListener(this);
		button92.addActionListener(this);
		button93.addActionListener(this);
		L8.addActionListener(this);
		button101.addActionListener(this);
		button102.addActionListener(this);
		button103.addActionListener(this);
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
		if (e.getSource() == button1 && panel.currentState == panel.MENU) {
			panel.currentState = panel.SELECT;
			panel.remove(button1);
			panel.remove(button2);
			panel.add(L1);
			panel.add(L2);
			panel.add(L3);
			panel.add(L4);
			panel.add(L5);
			panel.add(L6);
			panel.add(L7);
			panel.add(L8);
			panel.remove(RETURN);
			panel.add(score);
			frame.requestFocus();
		}
		if (e.getSource() == button2 && panel.currentState == panel.MENU) {
			JOptionPane.showMessageDialog(null,
					"Play levels and unscramble the words to get points! Earn 35 points to win! ");
			frame.requestFocus();
		}

		if (e.getSource() == L2) {
			panel.currentState = panel.L2;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			if (button41 != null) {
				panel.add(button41);
			}
			if (button42 != null) {
				panel.add(button42);
			}
			if (button43 != null) {
				panel.add(button43);
			}
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == L3) {
			panel.currentState = panel.L3;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			if (button51 != null) {
				panel.add(button51);
			}
			if (button52 != null) {
				panel.add(button52);
			}
			if (button53 != null) {
				panel.add(button53);
			}
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == L4) {
			panel.currentState = panel.L4;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			if (button61 != null) {
				panel.add(button61);
			}
			if (button62 != null) {
				panel.add(button62);
			}
			if (button63 != null) {
				panel.add(button63);
			}
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == L5) {
			panel.currentState = panel.L5;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			if (button71 != null) {
				panel.add(button71);
			}
			if (button72 != null) {
				panel.add(button72);
			}
			if (button73 != null) {
				panel.add(button73);
			}
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == L6) {
			panel.currentState = panel.L6;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			if (button81 != null) {
				panel.add(button81);
			}
			if (button82 != null) {
				panel.add(button82);
			}
			if (button83 != null) {
				panel.add(button83);
			}
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == L7) {
			panel.currentState = panel.L7;
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			if (button91 != null) {
				panel.add(button91);
			}
			if (button92 != null) {
				panel.add(button92);
			}
			if (button93 != null) {
				panel.add(button93);
			}
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == L8) {
			panel.currentState = panel.L8;
			panel.remove(L1);
			panel.remove(L2);
			panel.remove(L3);
			panel.remove(L4);
			panel.remove(L5);
			panel.remove(L6);
			panel.remove(L7);
			panel.remove(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			if (button101 != null) {
				panel.add(button101);
			}
			if (button102 != null) {
				panel.add(button102);
			}
			if (button103 != null) {
				panel.add(button103);
			}
			panel.add(RETURN);
			frame.requestFocus();
		}
		if (panel.currentState == panel.SELECT) {
			panel.add(L1);
			panel.add(L2);
			panel.add(L3);
			panel.add(L4);
			panel.add(L5);
			panel.add(L6);
			panel.add(L7);
			panel.add(L8);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.remove(button61);
			panel.remove(button62);
			panel.remove(button63);
			panel.remove(button71);
			panel.remove(button72);
			panel.remove(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.remove(RETURN);
			frame.requestFocus();
		}
		if (e.getSource() == RETURN) {
			panel.currentState = panel.SELECT;
			panel.remove(button1);
			panel.remove(button2);
			panel.add(L1);
			panel.add(L2);
			panel.add(L3);
			panel.add(L4);
			panel.add(L5);
			panel.add(L6);
			panel.add(L7);
			panel.add(L8);
			if (button31 != null) {
				panel.remove(button31);
			}
			if (button32 != null) {
				panel.remove(button32);
			}
			if (button33 != null) {
				panel.remove(button33);
			}
			if (button41 != null) {
				panel.remove(button41);
			}
			if (button42 != null) {
				panel.remove(button42);
			}
			if (button43 != null) {
				panel.remove(button43);
			}
			if (button51 != null) {
				panel.remove(button51);
			}
			if (button52 != null) {
				panel.remove(button52);
			}
			if (button53 != null) {
				panel.remove(button53);
			}
			if (button61 != null) {
				panel.remove(button61);
			}
			if (button62 != null) {
				panel.remove(button62);
			}
			if (button63 != null) {
				panel.remove(button63);
			}
			if (button71 != null) {
				panel.remove(button71);
			}
			if (button72 != null) {
				panel.remove(button72);
			}
			if (button73 != null) {
				panel.remove(button73);
			}
			if (button81 != null) {
				panel.remove(button81);
			}
			if (button82 != null) {
				panel.remove(button82);
			}
			if (button83 != null) {
				panel.remove(button83);
			}
			if (button91 != null) {
				panel.remove(button91);
			}
			if (button92 != null) {
				panel.remove(button92);
			}
			if (button93 != null) {
				panel.remove(button93);
			}
			if (button101 != null) {
				panel.remove(button101);
			}
			if (button102 != null) {
				panel.remove(button102);
			}
			if (button103 != null) {
				panel.remove(button103);
			}
			panel.remove(RETURN);
			frame.requestFocus();
		}

		score.setText(panel.points + " points");

		frame.pack();
	}

}
