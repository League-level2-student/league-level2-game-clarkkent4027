import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level8 extends LEVEL {
	public Level8() {
		setBounds(0, 0, 500, 500);
		JButton b81 = new JButton("Click to answer!");
		JButton b82 = new JButton("Click to answer!!");
		JButton b83 = new JButton("Click to answer!!!");
		b81.setBounds(100, 50, 200, 300);
		b82.setBounds(100, 50, 300, 300);
		b83.setBounds(100, 50, 400, 300);
		buttons.add(b81);
		buttons.add(b82);
		buttons.add(b83);

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
		g.drawString("LEVEL 8 : SPORTS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("N I S T E N", 70, 220);
		g.drawString("C R Y H E A R (x3)", 70, 340);
		g.drawString("N I C G L C Y (x3)", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer81 = ("o");
		if (b.getText().equals("Click to answer!")) {
			answer81 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer81.equals("tennis")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer82 = ("i");
		if (b.getText().equals("Click to answer!!")) {
			answer82 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer82.equals("archery")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 3;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("Click to answer!!!")) {
			String answer83 = (".");
			answer83 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer83.equals("cycling")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(2));
				WordPanel.points += 3;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		GameHome.score.setText(WordPanel.points + " points");
	}
}
