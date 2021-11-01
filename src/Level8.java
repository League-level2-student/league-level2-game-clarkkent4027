import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level8 extends LEVEL {
	public Level8() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b81 = new JButton("Click to answer!");
		JButton b82 = new JButton("Click to answer!");
		JButton b83 = new JButton("Click to answer!");
		b81.setBounds(100, 50, 200, 300);
		b82.setBounds(100, 50, 300, 300);
		b83.setBounds(100, 50, 400, 300);
		b81.addActionListener(this);
		b82.addActionListener(this);
		b83.addActionListener(this);
		buttons.add(b81);
		buttons.add(b82);
		buttons.add(b83);


		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("tennis")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("archery")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("cycling")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}
