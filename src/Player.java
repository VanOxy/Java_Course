import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	
	public static final int MAX_V = 30; 
	public static final int MAX_TOP = 90;
	public static final int MAX_BOTTOM = 235;
	
	

	Image img = new ImageIcon("res/player.jpg").getImage();

	int v = 0; // vitesse
	int dv = 0; // accel
	int s = 0; // distance

	int x = 30, y = 185; // coord de playerCar
	int dy = 0;

	int layer1 = 0; // coord x de "res/road.jpg"
	int layer2 = 603;

	public void move() {
		s += v;
		v += dv;
		if (v <= 0) v = 0;
		if ( v >= MAX_V) v = MAX_V;
		y -= dy;
		if(y<= MAX_TOP) y = MAX_TOP;
		if(y >= MAX_BOTTOM) y = MAX_BOTTOM;
		if (layer2 - v <= 0) {
			layer1 = 0;
			layer2 = 603;
		} else {
			layer1 -= v;
			layer2 -= v;
		}
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			dv = -1;
			break;
		case KeyEvent.VK_RIGHT:
			dv = 1;
			break;
		case KeyEvent.VK_UP:
			dy = 10;
			break;
		case KeyEvent.VK_DOWN:
			dy = -10;
			break;
		default:
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT)
			dv = 0;
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN)
			dy = 0;
	}
}
