import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level2 extends LEVEL {
	public Level2() {
		setBounds(0, 0, 500, 500);
		JButton b21 = new JButton("soakah");
		JButton b22 = new JButton("elucn neow");
		JButton b23 = new JButton("fomf digone");
		b21.setBounds(100, 50, 200, 300);
		b22.setBounds(100, 50, 300, 300);
		b23.setBounds(100, 50, 400, 300);
		buttons.add(b21);
		buttons.add(b22);
		buttons.add(b23);

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
		g.drawString("LEVEL 2 : STAR WARS", 60, 100);
		g.setFont(titleFont);
		g.setColor(Color.DARK_GRAY);
		g.drawString("S O A K A H", 70, 220);
		g.drawString("E L U C N  N E O W", 70, 340);
		g.drawString("F O M F  D I G O N E (x2)", 70, 460);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		String answer21 = ("o");
		if (b.getText().equals("soakah")) {
			answer21 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer21.equals("Ahsoka")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(0));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		String answer22 = ("i");
		if (b.getText().equals("elucn neow")) {
			answer22 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer22.equals("Uncle Owen")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				remove(buttons.get(1));
				WordPanel.points += 1;
			} else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
		}

		if (b.getText().equals("fomf digone")) {
			String answer23 = (".");
			answer23 = JOptionPane.showInputDialog(null, "What is the answer?");
			if (answer23.equals("Moff Gideon")) {
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