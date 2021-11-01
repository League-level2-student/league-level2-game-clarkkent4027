import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level4 extends LEVEL {
	public Level4() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b41 = new JButton("Click to answer!");
		JButton b42 = new JButton("Click to answer!");
		JButton b43 = new JButton("Click to answer!");
		b41.setBounds(100, 50, 200, 300);
		b42.setBounds(100, 50, 300, 300);
		b43.setBounds(100, 50, 400, 300);
		b41.addActionListener(this);
		b42.addActionListener(this);
		b43.addActionListener(this);
		buttons.add(b41);
		buttons.add(b42);
		buttons.add(b43);

		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("azure")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("burgundy")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("salmon")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 2;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}
