import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;



//public class SimpleWindow extends JPanel implements KeyListener
public class DrawingPanel extends JPanel {
	

	//Fields
	private Pathogen covidVirus;

	// Constructors
	
	// No args constructor
	// calls JPanel constructor
	// instantiates a RedCross object
	// sets the background color to WHITE
	public DrawingPanel() {
		super();
		covidVirus = new Covid();
		setBackground(Color.WHITE);
	}

	// Methods
	
	// Paint Component is called when the window is drawn initially and whenever the window is resized
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method to paint the background

		//  defer drawing the red cross to a RedCross object
		covidVirus.draw(g);
	}
	
	//
	// Instantiate the JFrame and set a few properties
	// Instantiate a DrawingPanel, set a few properties, and add it to the JFrame
	//
	public static void main(String[] args) {
		JFrame window = new JFrame("Immune Battle");
		window.setBounds(-10, 0, 2500, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingPanel panel = new DrawingPanel();
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);
	}

}