import java.awt.*;
import java.lang.*;

/*
 * Comment header
 */



public abstract class Pathogen {
	
	private int x;
	private int y;
	private Image pathogen;
	
	public Pathogen(int x, int y, Image pathogen) {
		
		this.x = x;
		this.y = y;
		this.pathogen = pathogen;
		
		
	}
	
	public void draw(Graphics g) {
		//Graphics 2d affine transformation wow
	}
	
	
	public abstract void attack();
	
	public abstract void targetPlayer(int speed);
	
	public abstract void setCurrentHelath();
	
	public abstract int getCurrentHealth();
	
}
