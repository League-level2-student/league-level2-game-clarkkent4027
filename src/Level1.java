import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level1 extends LEVEL {
	public Level1() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b11 = new JButton("Click to answer!");
		JButton b12 = new JButton("Click to answer!!");
		JButton b13 = new JButton("Click to answer!!!");
		b11.setBounds(100, 50, 400, 300);
		b12.setBounds(100, 50, 600, 300);
		b13.setBounds(100, 50, 800, 300);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		buttons.add(b11);
		buttons.add(b12);
		buttons.add(b13);

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
		g.drawString("LEVEL 1 : SEA ANIMALS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("B O L T E R S", 70, 220);
		g.drawString("H I S F A R T S", 70, 340);
		g.drawString("T E A M E A N (x2pts)", 70, 460);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer11 = ("o");
		if (b.getText().equals("Click to answer!")) {
			answer11 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer11.equals("lobster")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
				b = null;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer12 = ("i");
		if (b.getText().equals("Click to answer!!")) {
			answer12 = JOptionPane.showInputDialog(null, "What is the answer?");

			if (answer12.equals("starfish")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
				b = null;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("Click to answer!!!")) {
			String answer13 = ("p");
			answer13 = JOptionPane.showInputDialog(null, "What is the answer?");

			if (answer13.equals("manatee")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(2));
				WordPanel.points += 1;
				b = null;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
	}
}
