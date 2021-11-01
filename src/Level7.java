import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level7 extends LEVEL {
	public Level7() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b71 = new JButton("Click to answer!");
		JButton b72 = new JButton("Click to answer!");
		JButton b73 = new JButton("Click to answer!");
		b71.setBounds(100, 50, 200, 300);
		b72.setBounds(100, 50, 300, 300);
		b73.setBounds(100, 50, 400, 300);
		b71.addActionListener(this);
		b72.addActionListener(this);
		b73.addActionListener(this);
		buttons.add(b71);
		buttons.add(b72);
		buttons.add(b73);


		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("viola")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("tambourine")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("trombone")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}

