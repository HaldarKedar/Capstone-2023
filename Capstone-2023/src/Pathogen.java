import java.awt.*;
import java.lang.*;

import javax.swing.ImageIcon;

/*
 * Comment header
 */



public abstract class Pathogen {
	
	private int x;
	private int y;
	private Image pathogen;
	private CoordinateSystem coordinates;
	private int health;
	private int damage;
	private int speed;
	
	public Pathogen() {
		
		speed = 5;
		damage = 7;
		health = 6;
		
		this.x = 2463; // 2500 - 37 (37 is width of image)
		this.y = (int)(Math.random()*1000); // Random y-coor so that all viruses are coming from different parts of edge of screen
		
		this.pathogen = pathogen;
		this.coordinates = new CoordinateSystem(x, y, pathogen);
		
		
	}
	
	
	public abstract void draw(Graphics g);
	

	public abstract void attack(int damage);

	
	public abstract void move(int speed);

	
	public abstract void setCurrentHealth(int healthLoss);

	
	public abstract int getCurrentHealth();
	
	
	public CoordinateSystem getCoordinates() {
		return this.coordinates;
	}
	
	
	public int getX() {
		return this.x;
	}
	
	
	public int getY() {
		return this.y;
	}
}
