import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Jeu de course en mousse");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 375);
		f.setResizable(false);
		f.add(new Road());
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
