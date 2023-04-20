

/*
 * Comment header
 */


import java.awt.Image;
import java.lang.Math;


public class Covid extends Pathogen {
	
	private int x;
	private int y;
	private int health = 100;
	private int damage;
	private int speed;
	private Image pathogen;
	
	public Covid(int x, int y, Image covid) {
		super(x, y, covid);
		
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void targetPlayer(int speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentHelath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrentHealth() {
		return health;
		
	}
	

	
}
