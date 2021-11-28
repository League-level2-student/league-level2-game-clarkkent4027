import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level7 extends LEVEL {
	public Level7() {
		setBounds(0, 0, 500, 500);
		JButton b71 = new JButton("oliva");
		JButton b72 = new JButton("baminetour");
		JButton b73 = new JButton("moonbert");
		b71.setBounds(100, 50, 200, 300);
		b72.setBounds(100, 50, 300, 300);
		b73.setBounds(100, 50, 400, 300);
		buttons.add(b71);
		buttons.add(b72);
		buttons.add(b73);

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
		g.drawString("LEVEL 7 : INSTRUMENTS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("O L I V A", 70, 220);
		g.drawString("B A M I N E T O U R", 70, 340);
		g.drawString("M O O N B E R T (x2)", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer71 = ("o");
		if (b.getText().equals("oliva")) {
			answer71 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer71.equals("viola")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer72 = ("i");
		if (b.getText().equals("baminetour")) {
			answer72 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer72.equals("tambourine")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("moonbert")) {
			String answer73 = (".");
			answer73 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer73.equals("trombone")) {
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
