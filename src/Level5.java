import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level5 extends LEVEL {
	public Level5() {
		setBounds(0, 0, 500, 500);
		JButton b51 = new JButton("criatsatos");
		JButton b52 = new JButton("afastani");
		JButton b53 = new JButton("pilegens byaetu");
		b51.setBounds(100, 50, 200, 300);
		b52.setBounds(100, 50, 300, 300);
		b53.setBounds(100, 50, 400, 300);
		buttons.add(b51);
		buttons.add(b52);
		buttons.add(b53);

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
		g.drawString("LEVEL 5 : DISNEY MOVIES", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("C R I A T S A T O S", 70, 220);
		g.drawString("A F A S T A N I ", 70, 340);
		g.drawString("P I L E G E N S  B Y A E T U (x2)", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer51 = ("o");
		if (b.getText().equals("criatsatos")) {
			answer51 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer51.equals("Aristocats")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer52 = ("i");
		if (b.getText().equals("afastani")) {
			answer52 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer52.equals("Fantasia")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("pilegens byaetu")) {
			String answer53 = (".");
			answer53 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer53.equals("Sleeping Beauty")) {
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
