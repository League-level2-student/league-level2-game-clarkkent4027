import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level4 extends LEVEL {
	public Level4() {
		setBounds(0, 0, 500, 500);
		JButton b41 = new JButton("Click to answer!");
		JButton b42 = new JButton("Click to answer!!");
		JButton b43 = new JButton("Click to answer!!!");
		b41.setBounds(100, 50, 200, 300);
		b42.setBounds(100, 50, 300, 300);
		b43.setBounds(100, 50, 400, 300);
		b41.addActionListener(this);
		b42.addActionListener(this);
		b43.addActionListener(this);
		buttons.add(b41);
		buttons.add(b42);
		buttons.add(b43);

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
		g.drawString("LEVEL 4 : COLORS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("R E A U Z", 70, 220);
		g.drawString("C E L S T A R", 70, 340);
		g.drawString("M A S O N L (x2)", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer41 = ("o");
		if (b.getText().equals("Click to answer!")) {
			answer41 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer41.equals("azure")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer42 = ("i");
		if (b.getText().equals("Click to answer!!")) {
			answer42 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer42.equals("scarlet")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("Click to answer!!!")) {
			String answer43 = (".");
			answer43 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer43.equals("salmon")) {
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
