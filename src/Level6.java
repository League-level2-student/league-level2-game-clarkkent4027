import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level6 extends LEVEL {
	public Level6() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b61 = new JButton("Click to answer!");
		JButton b62 = new JButton("Click to answer!");
		JButton b63 = new JButton("Click to answer!");
		b61.setBounds(100, 50, 200, 300);
		b62.setBounds(100, 50, 300, 300);
		b63.setBounds(100, 50, 400, 300);
		b61.addActionListener(this);
		b62.addActionListener(this);
		b63.addActionListener(this);
		buttons.add(b61);
		buttons.add(b62);
		buttons.add(b63);


		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("mantis")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("ladybug")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("termite")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}
