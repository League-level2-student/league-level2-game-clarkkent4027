import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level6 extends LEVEL {
	public Level6() {
		setBounds(0, 0, 500, 500);
		JButton b61 = new JButton("Click to answer!");
		JButton b62 = new JButton("Click to answer!!");
		JButton b63 = new JButton("Click to answer!!!");
		b61.setBounds(100, 50, 200, 300);
		b62.setBounds(100, 50, 300, 300);
		b63.setBounds(100, 50, 400, 300);
		buttons.add(b61);
		buttons.add(b62);
		buttons.add(b63);

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
		g.drawString("LEVEL 6 : INSECTS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("N A S T I M", 70, 220);
		g.drawString("G L A D B U Y", 70, 340);
		g.drawString("M I T T E R E (x2)", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer61 = ("o");
		if (b.getText().equals("Click to answer!")) {
			answer61 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer61.equals("mantis")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer62 = ("i");
		if (b.getText().equals("Click to answer!!")) {
			answer62 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer62.equals("ladybug")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("Click to answer!!!")) {
			String answer63 = (".");
			answer63 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer63.equals("termite")) {
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
