/*
 * Author: Kedar Haldar
 * Date: 3/19/23
 * Rev: 01
 * Notes - Added popup that informs user that they have enough money to buy more than one, asks them if they want to, tried to make it more aesthetic
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VendingMachine extends JPanel implements ActionListener {
	private static final int FULL_STOCK = 5;
	private JButton deposit25c, deposit10c, deposit5c, go, purchaseMore, purchaseNo;
	private JTextField display;
	private Vendor vendor;
	boolean trayFull;
	static boolean multiple;
	Color brandColor;
	Color darkRed = new Color(173, 23, 23);
	Color lightRed = new Color(251, 209, 209);
	Color mint = new Color(209, 251, 250);
	Color border = new Color(152, 214, 226);
	String brandName;

	public VendingMachine(String brand, Color color, int price, ImageIcon coin) {
		setBackground(Color.WHITE);
		brandColor = color;
		brandName = brand;

		JTextField banner = new JTextField("  " + brandName + "  " + price + "c  ");
		banner.setEditable(false);
		banner.setFont(new Font("Serif", Font.BOLD, 14));
		banner.setBackground(border);
		banner.setHorizontalAlignment(JTextField.CENTER);

		deposit25c = new JButton(" 25 ", coin);
		deposit25c.addActionListener(this);
		deposit10c = new JButton(" 10 ", coin);
		deposit10c.addActionListener(this);
		deposit5c = new JButton("  5 ", coin);
		deposit5c.addActionListener(this);

		purchaseMore = new JButton("Yes");
		purchaseMore.addActionListener(this);
		purchaseNo = new JButton("No");
		purchaseNo.addActionListener(this);

		go = new JButton("   ");

		go.setBackground(darkRed);
		go.addActionListener(this);
		JPanel buttons = new JPanel(new GridLayout(3, 1, 5, 0));
		buttons.setBackground(Color.ORANGE);
		buttons.add(deposit25c);
		buttons.add(deposit10c);
		buttons.add(deposit5c);

		display = new JTextField("0  ");
		display.setFont(new Font("Monospaced", Font.BOLD, 16));
		display.setBackground(lightRed);
		display.setEditable(false);
		display.setHorizontalAlignment(JTextField.RIGHT);

		Box b1 = Box.createVerticalBox();
		b1.add(banner);
		b1.add(Box.createVerticalStrut(5));
		b1.add(display);
		b1.add(Box.createVerticalStrut(12));
		Box b2 = Box.createHorizontalBox();
		b2.add(Box.createHorizontalStrut(60));
		Box b3 = Box.createVerticalBox();
		b3.add(go);
		b3.add(Box.createVerticalStrut(8));
		b3.add(buttons);
		b2.add(b3);
		b1.add(b2);
		b1.add(Box.createVerticalStrut(5));
		add(b1);

		vendor = new Vendor(price, FULL_STOCK);
	}

	public void reload() {
		vendor.setStock(FULL_STOCK);
		display.setText(" " + vendor.getDeposit() + "  ");
		repaint();
	}

	public static boolean isMultiple() {
		return multiple;
	}

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		int price = 0;
		if (b == deposit25c) {
			vendor.addMoney(25);
			price = 25;
		} else if (b == deposit10c) {
			vendor.addMoney(10);
			price = 10;
		} else if (b == deposit5c) {
			vendor.addMoney(5);
			price = 5;
		} else if (b == go) {
			trayFull = vendor.makeSale();

			int stock = vendor.getStock();
			int change = vendor.getChange();
			int money = vendor.getDeposit();
			int depo = vendor.getDepo();
			int cost = vendor.getPrice();

			if (trayFull) { //successful sale
				repaint();
				trayFull = false;
			} else if (change > 0) // Refund
			
			{
				JOptionPane.showMessageDialog(null, "Take " + change + "c back", "Money back",
						JOptionPane.ERROR_MESSAGE);
			}

		}

		if (vendor.getStock() > 0)
			display.setText(" " + vendor.getDeposit() + "  ");
		else
			display.setText("Call service ");
		// JOptionPane.showMessageDialog(null, "Machine stock is depleted" +
		// JOptionPane.PLAIN_MESSAGE);
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		final int x0 = getWidth() / 12;
		final int y0 = getHeight() / 2;
		final int yStep = 14;

		g.setColor(Color.BLACK);
		g.drawRect(x0, y0, 28, FULL_STOCK * yStep + 4);

		int y = y0 + 4, x = x0 + 4;
		int stock = vendor.getStock();
		int count = FULL_STOCK;

		while (count > 0) {
			if (count <= stock)
				drawCan(g, x, y);
			y += yStep;
			count--;
		}

		g.setColor(Color.BLUE);
		y += yStep;
		g.drawRect(x0, y - 4, 28, 18);

		if (trayFull)
			drawCan(g, x, y);
	}

	private void drawCan(Graphics g, int x, int y) {
		g.setColor(brandColor);
		g.fillRoundRect(x, y, 20, 10, 4, 4);
		g.setColor(Color.WHITE);
		g.drawLine(x + 2, y + 4, x + 14, y + 4);
		g.drawLine(x + 2, y + 6, x + 14, y + 6);
	}
}
