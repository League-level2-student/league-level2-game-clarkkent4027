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
	JButton button3;
	JButton button31;
	JButton button32;
	JButton button33;
	JButton button4;
	JButton button41;
	JButton button42;
	JButton button43;
	JButton button5;
	JButton button51;
	JButton button52;
	JButton button53;
	JButton button6;
	JButton button61;
	JButton button62;
	JButton button63;
	JButton button7;
	JButton button71;
	JButton button72;
	JButton button73;
	JButton button8;
	JButton button81;
	JButton button82;
	JButton button83;
	JButton button9;
	JButton button91;
	JButton button92;
	JButton button93;
	JButton button10;
	JButton button101;
	JButton button102;
	JButton button103;
	JButton button1000;
	JLabel score;
	public static final int HEIGHT = 700;
	public static final int WIDTH = 700;

	public static void main(String[] args) {
		GameHome game = new GameHome();
	}

	GameHome() {
		frame = new JFrame();
		panel = new WordPanel();
		button1 = new JButton("PLAY");
		button2 = new JButton("INSTRUCTIONS");
		button3 = new JButton("1");
		button31 = new JButton("Click to answer");
		button32 = new JButton("Click to answer");
		button33 = new JButton("Click to answer");
		button4 = new JButton("2");
		button41 = new JButton("Click to answer");
		button42 = new JButton("Click to answer");
		button43 = new JButton("Click to answer");
		button5 = new JButton("3");
		button51 = new JButton("Click to answer");
		button52 = new JButton("Click to answer");
		button53 = new JButton("Click to answer");
		button6 = new JButton("4");
		button61 = new JButton("Click to answer");
		button62 = new JButton("Click to answer");
		button63 = new JButton("Click to answer");
		button7 = new JButton("5");
		button71 = new JButton("Click to answer");
		button72 = new JButton("Click to answer");
		button73 = new JButton("Click to answer");
		button8 = new JButton("6");
		button81 = new JButton("Click to answer");
		button82 = new JButton("Click to answer");
		button83 = new JButton("Click to answer");
		button9 = new JButton("7");
		button91 = new JButton("Click to answer");
		button92 = new JButton("Click to answer");
		button93 = new JButton("Click to answer");
		button10 = new JButton("8");
		button101 = new JButton("Click to answer");
		button102 = new JButton("Click to answer");
		button103 = new JButton("Click to answer");
		button1000 = new JButton("RETURN");
		score = new JLabel(panel.points + " points");
		panel.setLayout(null);
		button1.setBounds(120, 400, 200, 100);
		button2.setBounds(370, 400, 200, 100);
		button3.setBounds(100, 200, 50, 50);
		button31.setBounds(550, 160, 125, 60);
		button32.setBounds(550, 280, 125, 60);
		button33.setBounds(550, 400, 125, 60);
		button4.setBounds(200, 200, 50, 50);
		button41.setBounds(550, 160, 125, 60);
		button42.setBounds(550, 280, 125, 60);
		button43.setBounds(550, 400, 125, 60);
		button5.setBounds(300, 200, 50, 50);
		button51.setBounds(550, 160, 125, 60);
		button52.setBounds(550, 280, 125, 60);
		button53.setBounds(550, 400, 125, 60);
		button6.setBounds(400, 200, 50, 50);
		button61.setBounds(550, 160, 125, 60);
		button62.setBounds(550, 280, 125, 60);
		button63.setBounds(550, 400, 125, 60);
		button7.setBounds(500, 200, 50, 50);
		button71.setBounds(550, 160, 125, 60);
		button72.setBounds(550, 280, 125, 60);
		button73.setBounds(550, 400, 125, 60);
		button8.setBounds(600, 200, 50, 50);
		button81.setBounds(550, 160, 125, 60);
		button82.setBounds(550, 280, 125, 60);
		button83.setBounds(550, 400, 125, 60);
		button9.setBounds(100, 300, 50, 50);
		button91.setBounds(550, 160, 125, 60);
		button92.setBounds(550, 280, 125, 60);
		button93.setBounds(550, 400, 125, 60);
		button10.setBounds(200, 300, 50, 50);
		button101.setBounds(550, 160, 125, 60);
		button102.setBounds(550, 280, 125, 60);
		button103.setBounds(550, 400, 125, 60);
		button1000.setBounds(50, 600, 125, 60);
		score.setBounds(625, -100, 250, 250);
		setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.remove(button3);
		panel.remove(button31);
		panel.remove(button32);
		panel.remove(button33);
		panel.remove(button4);
		panel.remove(button41);
		panel.remove(button42);
		panel.remove(button43);
		panel.remove(button5);
		panel.remove(button51);
		panel.remove(button52);
		panel.remove(button53);
		panel.remove(button6);
		panel.remove(button61);
		panel.remove(button62);
		panel.remove(button63);
		panel.remove(button7);
		panel.remove(button71);
		panel.remove(button72);
		panel.remove(button73);
		panel.remove(button8);
		panel.remove(button81);
		panel.remove(button82);
		panel.remove(button83);
		panel.remove(button9);
		panel.remove(button91);
		panel.remove(button92);
		panel.remove(button93);
		panel.remove(button10);
		panel.remove(button101);
		panel.remove(button102);
		panel.remove(button103);
		panel.remove(button1000);
		panel.remove(score);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button31.addActionListener(this);
		button32.addActionListener(this);
		button33.addActionListener(this);
		button4.addActionListener(this);
		button41.addActionListener(this);
		button42.addActionListener(this);
		button43.addActionListener(this);
		button5.addActionListener(this);
		button51.addActionListener(this);
		button52.addActionListener(this);
		button53.addActionListener(this);
		button6.addActionListener(this);
		button61.addActionListener(this);
		button62.addActionListener(this);
		button63.addActionListener(this);
		button7.addActionListener(this);
		button71.addActionListener(this);
		button72.addActionListener(this);
		button73.addActionListener(this);
		button8.addActionListener(this);
		button81.addActionListener(this);
		button82.addActionListener(this);
		button83.addActionListener(this);
		button9.addActionListener(this);
		button91.addActionListener(this);
		button92.addActionListener(this);
		button93.addActionListener(this);
		button10.addActionListener(this);
		button101.addActionListener(this);
		button102.addActionListener(this);
		button103.addActionListener(this);
		button1000.addActionListener(this);
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
			panel.add(button3);
			panel.add(button4);
			panel.add(button5);
			panel.add(button6);
			panel.add(button7);
			panel.add(button8);
			panel.add(button9);
			panel.add(button10);
			panel.remove(button1000);
			panel.add(score);
			frame.requestFocus();
		}
		if (e.getSource() == button2 && panel.currentState == panel.MENU) {
			JOptionPane.showMessageDialog(null, "Play levels and unscramble the words to get points! Earn 35 points to win! ");
			frame.requestFocus();
		}
		if (e.getSource() == button3) {
			panel.currentState = panel.L1;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
			panel.add(button31);
			panel.add(button32);
			panel.add(button33);
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
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button4) {
			panel.currentState = panel.L2;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.add(button41);
			panel.add(button42);
			panel.add(button43);
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
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button5) {
			panel.currentState = panel.L3;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.add(button51);
			panel.add(button52);
			panel.add(button53);
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
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button6) {
			panel.currentState = panel.L4;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
			panel.remove(button31);
			panel.remove(button32);
			panel.remove(button33);
			panel.remove(button41);
			panel.remove(button42);
			panel.remove(button43);
			panel.remove(button51);
			panel.remove(button52);
			panel.remove(button53);
			panel.add(button61);
			panel.add(button62);
			panel.add(button63);
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
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button7) {
			panel.currentState = panel.L5;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
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
			panel.add(button71);
			panel.add(button72);
			panel.add(button73);
			panel.remove(button81);
			panel.remove(button82);
			panel.remove(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button8) {
			panel.currentState = panel.L6;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
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
			panel.add(button81);
			panel.add(button82);
			panel.add(button83);
			panel.remove(button91);
			panel.remove(button92);
			panel.remove(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button9) {
			panel.currentState = panel.L7;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
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
			panel.add(button91);
			panel.add(button92);
			panel.add(button93);
			panel.remove(button101);
			panel.remove(button102);
			panel.remove(button103);
			panel.add(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button10) {
			panel.currentState = panel.L8;
			panel.remove(button3);
			panel.remove(button4);
			panel.remove(button5);
			panel.remove(button6);
			panel.remove(button7);
			panel.remove(button8);
			panel.remove(button9);
			panel.remove(button10);
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
			panel.add(button101);
			panel.add(button102);
			panel.add(button103);
			panel.add(button1000);
			frame.requestFocus();
		}
		if (panel.currentState == panel.SELECT) {
			panel.add(button3);
			panel.add(button4);
			panel.add(button5);
			panel.add(button6);
			panel.add(button7);
			panel.add(button8);
			panel.add(button9);
			panel.add(button10);
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
			panel.remove(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button1000) {
			panel.currentState = panel.SELECT;
			panel.remove(button1);
			panel.remove(button2);
			panel.add(button3);
			panel.add(button4);
			panel.add(button5);
			panel.add(button6);
			panel.add(button7);
			panel.add(button8);
			panel.add(button9);
			panel.add(button10);
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
			panel.remove(button1000);
			frame.requestFocus();
		}
		if (e.getSource() == button31) {
			String answer31 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer31.equals("shark")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button31);
				panel.points=panel.points+1;
				System.out.println(panel.points);
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button32) {
			String answer32 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer32.equals("clownfish")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button32);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button33) {
			String answer33 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer33.equals("manatee")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button33);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button41) {
			String answer41 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer41.equals("Anakin")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button41);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button42) {
			String answer42 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer42.equals("Mace Windu")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button42);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button43) {
			String answer43 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer43.equals("Jyn Erso")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button43);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button51) {
			String answer51 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer51.equals("daisy")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button51);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button52) {
			String answer52 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer52.equals("carnation")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button52);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button53) {
			String answer53 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer53.equals("magnolia")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button53);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button61) {
			String answer61 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer61.equals("azure")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button61);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button62) {
			String answer62 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer62.equals("salmon")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button62);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button63) {
			String answer63 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer63.equals("burgundy")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button63);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (e.getSource() == button71) {
			String answer71 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer71.equals("Aladdin")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button71);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button72) {
			String answer72 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer72.equals("Zootopia")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button72);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button73) {
			String answer73 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer73.equals("Onward")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button73);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		
		if (e.getSource() == button81) {
			String answer71 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer71.equals("mantis")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button81);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button82) {
			String answer72 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer72.equals("ladybug")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button82);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button83) {
			String answer73 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer73.equals("termite")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button83);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button91) {
			String answer71 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer71.equals("viola")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button91);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button92) {
			String answer72 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer72.equals("trombone")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button92);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button93) {
			String answer73 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer73.equals("tambourine")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button93);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button101) {
			String answer71 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer71.equals("viola")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button101);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button102) {
			String answer72 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer72.equals("trombone")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button102);
				panel.points=panel.points+1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		if (e.getSource() == button103) {
			String answer73 = JOptionPane.showInputDialog("WHAT IS THE ANSWER?");
			if (answer73.equals("tambourine")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				panel.remove(button103);
				panel.points=panel.points+2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		frame.pack();
	}

}
