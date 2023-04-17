/*
   Author: KEdar Haldar
   Date: 3/13/23
   Rev: 01
   Notes - Completed standard lab requirements, and if you have enough money to buy more of the items have a pop up ask if they want to buy more, then proceed
*/

import java.awt.*;

import javax.swing.JOptionPane;

public class Vendor {
	// Fields:
	private int items;
	private int deposited;
	private int price;
	private int change;
	private int depo;

	private static double totalSales = 0;
	// Constructor
	// Parameters:

	public Vendor(int prices, int stock) {
		price = prices;
		items = stock;
		deposited = 0;
		change = 0;
		depo = 0;
	}

	// Sets the quantity of items in stock.
	// Parameters:
	// int number of items to place in stock
	// Return:
	public void setStock(int stock) {
		items = stock;
	}

	// Returns the number of items currently in stock.
	// Parameters:
	// None
	// Return:
	// int number of items currently in stock
	public int getStock() {
		return this.items;
	}

	// Adds a specified amount (in cents) to the deposited amount.
	// Parameters:
	// int number of cents to add to the deposit
	// Return:
	// None
	public void addMoney(int cents) {
		deposited += cents;
	}

	// Returns the currently deposited amount (in cents).
	// Parameters:
	// None
	// Return:
	// int number of cents in the current deposit
	public int getDeposit() {
		return deposited;
	}

	public int getDepo() {
		return depo;
	}

	public boolean makeSale() {

		int stock = items;
		if (deposited >= price && items != 0) {
			if (deposited >= 2 * price) {
				int response = JOptionPane.showConfirmDialog(null,
						"You have enough money to buy more than one of this it. Would you like to purchase more?", null,
						JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION) {
					items -= deposited / price;
					change = deposited - price * (stock - items);
				} else {
					items--;
					change = deposited - price;
					JOptionPane.showMessageDialog(null, "Enjoy your item\n" + " Change " + change + "c", "",
							JOptionPane.PLAIN_MESSAGE);
				}
			} else {
				items--;
				change = deposited - price;
				JOptionPane.showMessageDialog(null, "Enjoy your item\n" + " Change " + change + "c", "",
						JOptionPane.PLAIN_MESSAGE);
			}
			totalSales = totalSales + deposited - change;
			System.out.println(totalSales);
			depo = deposited;
			deposited = change;

			return true;
		}

		if (items == 0) {
			deposited = 0;
			change = 0;
			return false;

		}
		change = deposited;

		return false;

	}

	public int getPrice() {
		return price;
	}

	// Returns and zeroes out the amount of change (from the last
	// sale or refund).
	// Parameters:
	// None
	// Return:
	// int number of cents in the current change
	public int getChange() {
		return change;
	}

	public static double getTotalSales() {
		double sales = totalSales/100;
		totalSales = 0;
		return sales;

	}
}
