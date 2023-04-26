

/*
 * Comment header
 */


import java.awt.Graphics;
import java.awt.Image;
import java.lang.Math;

import javax.swing.ImageIcon;


public class Covid extends Pathogen {
	
	private Image pic;
	private CoordinateSystem coordinates;
	
	public Covid() {
		
		super();
		this.coordinates = super.getCoordinates();
		pic = (new ImageIcon("pathogen1.png")).getImage();
		
	}
	
	
	public void draw(Graphics g) {
		
		
		
	}
	
	
	public void attack(int damage) {
		
		// Add code
		
	}

	
	public void move(int speed) {
		getCoordinates().shift(-speed,0);
	}

	
	public void setCurrentHealth(int healthLoss) {
		//health -= healthLoss;
		
	}

	
	public int getCurrentHealth() {
		//return health;
		return 1;
		
	}
	
}
