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
		
	}
	
	
	public abstract void attack();
	
	public abstract void targetPlayer();
	
	
}
