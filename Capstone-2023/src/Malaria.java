
/*
 * Comment header
 */


import java.lang.Math;
import java.awt.*;

public class Malaria extends Pathogen {
	
	private int x = 500;
	private int y = (int) (Math.random() * 1000);
	private Image malaria;
	private int health = 100;
	private int damage;
	private int speed;
	
	
	public Malaria(int x, int y, Image ecoli) {
		super(x, y, ecoli);
		
		
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
 