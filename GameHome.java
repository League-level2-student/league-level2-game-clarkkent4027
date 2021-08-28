import javax.swing.JFrame;

public class GameHome {
	JFrame frame;
	WordPanel panel;
	public static final int HEIGHT = 700;
	public static final int WIDTH = 700;

	public static void main(String[] args) {
		GameHome game = new GameHome();
	}

	GameHome() {
		frame = new JFrame();
		panel = new WordPanel();
		setup();
	}

	void setup() {
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.addMouseListener(panel);
		frame.addKeyListener(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	}

}
