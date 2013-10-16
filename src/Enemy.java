import java.awt.Image;

import javax.swing.ImageIcon;


public class Enemy {
	
	int x;
	int y;
	int v;
	Image img = new ImageIcon("res/blueCar.jpg").getImage();
	Road road;
	
	public Enemy(int x, int y, int v, Road road){
		this.x = x;
		this.y = y;
		this.v = v;
		this.road = road;
	}
	
	public void move(){
		x = x - road.p.v + v;
	}
	
}
