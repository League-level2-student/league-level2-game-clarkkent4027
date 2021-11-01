import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level3 extends LEVEL {
	public Level3() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b31 = new JButton("Click to answer!");
		JButton b32 = new JButton("Click to answer!");
		JButton b33 = new JButton("Click to answer!");
		b31.setBounds(100, 50, 200, 300);
		b32.setBounds(100, 50, 300, 300);
		b33.setBounds(100, 50, 400, 300);
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		buttons.add(b31);
		buttons.add(b32);
		buttons.add(b33);

		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("orchid")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("carnation")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("magnolia")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 2;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}
