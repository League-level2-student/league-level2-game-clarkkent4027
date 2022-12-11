import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level3 extends LEVEL {
	public Level3() {
		setBounds(0, 0, 500, 500);
		JButton b31 = new JButton("dircho");
		JButton b32 = new JButton("tonarniac");
		JButton b33 = new JButton("omangail");
		b31.setBounds(100, 50, 200, 300);
		b32.setBounds(100, 50, 300, 300);
		b33.setBounds(100, 50, 400, 300);
		buttons.add(b31);
		buttons.add(b32);
		buttons.add(b33);

		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		Font titleFont = new Font("Malgun Gothic", Font.BOLD, 45);
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, GameHome.WIDTH, GameHome.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("LEVEL 3 : FLOWERS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("D I R C H O", 70, 220);
		g.drawString("T O N A R N I A C", 70, 340);
		g.drawString("O M A N G A I L (x2)", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer31 = ("o");
		if (b.getText().equals("dircho")) {
			answer31 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer31.equals("orchid")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer32 = ("i");
		if (b.getText().equals("tonarniac")) {
			answer32 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer32.equals("carnation")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("omangail")) {
			String answer33 = (".");
			answer33 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer33.equals("magnolia")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(2));
				WordPanel.points += 2;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		GameHome.score.setText(WordPanel.points + " points");
	}
}
