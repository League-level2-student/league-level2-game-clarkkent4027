import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Level2 extends LEVEL {
	public Level2() {
		setBounds(0, 0, GameHome.HEIGHT, GameHome.WIDTH);
		JButton b21 = new JButton("Click to answer!");
		JButton b22 = new JButton("Click to answer!");
		JButton b23 = new JButton("Click to answer!");
		b21.setBounds(100, 50, 200, 300);
		b22.setBounds(100, 50, 300, 300);
		b23.setBounds(100, 50, 400, 300);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		buttons.add(b21);
		buttons.add(b22);
		buttons.add(b23);


		for (JButton b : buttons) {
			b.addActionListener(this);
			add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Anakin")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(0));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		if (b.getText().equals("Greedo")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(1));
			WordPanel.points += 1;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");

		}
		if (b.getText().equals("Jyn Erso")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			remove(buttons.get(2));
			WordPanel.points += 2;
			b = null;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}
}
