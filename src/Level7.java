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
		JButton b71 = new JButton("kingcots");
		JButton b72 = new JButton("gegone");
		JButton b73 = new JButton("thorn lope");
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
		g.drawString("LEVEL 7 : HOLIDAY", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("K I N G C O T S", 70, 220);
		g.drawString("G E G O N E", 70, 340);
		g.drawString("T H O R N  L O P E", 70, 460);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer71 = ("o");
		if (b.getText().equals("kingcots")) {
			answer71 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer71.equals("stocking")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer72 = ("i");
		if (b.getText().equals("gegone")) {
			answer72 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer72.equals("eggnog")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("thorn lope")) {
			String answer73 = (".");
			answer73 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer73.equals("North Pole")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(2));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}
		GameHome.score.setText(WordPanel.points + " points");
	}
}
