import java.awt.Graphics;

public interface PathogenBuilder {

	void draw(Graphics g);
	
	void attack();
	
	void targetPlayer(int speed);
	
	void setCurrentHealth(int healthLoss);
	
	int getCurrentHealth();
	
}
