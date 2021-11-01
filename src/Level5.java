import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level5 extends LEVEL {
	public Level5() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b51 = new JButton("Click to answer!");
		JButton b52 = new JButton("Click to answer!");
		JButton b53 = new JButton("Click to answer!");
		b51.setBounds(100, 50, 200, 300);
		b52.setBounds(100, 50, 300, 300);
		b53.setBounds(100, 50, 400, 300);
		b51.addActionListener(this);
		b52.addActionListener(this);
		b53.addActionListener(this);
		buttons.add(b51);
		buttons.add(b52);
		buttons.add(b53);


		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Aladdin")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("Fantasia")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("Onward")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 2;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}

