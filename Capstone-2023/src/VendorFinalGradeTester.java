/*

 Author:  Ed Taylor
 Date:    03/25/2018
 Version: v0.2
 
 Final tester for SnackBar Lab.  This tester is for the Vendor class
 
 Assumptions:
 - tests only for basic functionality. choice and/or extra methods not tested
 - choice methods and additional functionality to be evaluated manually

*/

public class VendorFinalGradeTester
{
	
    
    private int price;    // single item price
    private int stock;    // stock quantity
    private int deposit;  // deposited money in cents
  	private int change;   // change from sale in cents

  	// Sets initial object with price per item and initial stock quantity
  	VendorFinalGradeTester (int price, int numItems)
  	{
  		this.price = price;
  		setStock(numItems);
  		deposit = 0;
  		change = 0;
  	}
  	
  	//  Sets the quantity of items in stock.
  	public void setStock(int numItems)
  	{
  		stock = numItems;
  	}

  	//  Returns the number of items currently in stock.
  	public int getStock()
  	{
  		return stock;
  	}

  	//  Adds a specified amount (in cents) to the deposited amount.
  	public void addMoney(int cents)
  	{
  		deposit += cents;
  	}

  	//  Returns the currently deposited amount (in cents).
  	public int getDeposit()
  	{
  		return deposit;
  	}

  	//  Implements a sale.  If there are items in stock and
  	//  the deposited amount is greater than or equal to
  	//  the single item price, then adjusts the stock
  	//  and calculates and sets change and returns true;
  	//  otherwise refunds the whole deposit (moves it into change)
  	//  and returns false.
  	public boolean makeSale()
  	{
  		if (stock > 0)
  		{
  			if (deposit >= price)
  			{
  				stock --;
  				change = deposit - price;
  				deposit = 0;
  				return true;
  			}
  			else 
  			{
  				change = deposit;
  				deposit = 0;
  				return false;
  			}  
  		}
  		else 
  		{
  			change = deposit;
  			deposit = 0;
  			return false;
  		}
  	}

  	//  Returns and zeroes out the amount of change (from the last
  	//  sale or refund).
  	public int getChange()
  	{
  		int changeHolder = 0; // local holder for change amount
	  
  		changeHolder = change;// hold present change amount
  		change = 0;           // zero change
  		return changeHolder;  // return change
  	}
  	
  	public static void main(String[] args) {
  		
  		// possible points
  		final int TOTALPOINTS = 10;
  		
  		// test prices
  		final int TESTPRICE00 = 0;
  		final int TETSPRICE10 = 10;
  		
  		// test stock counts
  		final int TESTSTOCK00 = 0;
  		final int TESTSTOCK10 = 10;
  	    
  		// test counters
  		int testCount = 0;  	
  		int failCount = 0;	
  		double percentPass = 0;	
  	    double earnedPoints = 0;
  	    
  	    // set-up test objects
  	    VendorFinalGradeTester testObj01;
  	    VendorFinalGradeTester testObj02;
  	    VendorFinalGradeTester testObj03;
  	    VendorFinalGradeTester testObj04;
  	
  	    testObj01 = new VendorFinalGradeTester(0,0); 		// 0 cent price, 0 inventory
  	    testObj02 = new VendorFinalGradeTester(0,10);		// 0 cent price, 10 inventory
  	    testObj03 = new VendorFinalGradeTester(10,0);		// 10 cent price, 0 inventory
  	    testObj04 = new VendorFinalGradeTester(10,10);	// 10 cent price, 10 inventory
  	    
  	    
  	    // set-up vendor objects 
  	    Vendor vendorObj01;
	    Vendor vendorObj02;
	    Vendor vendorObj03;
	    Vendor vendorObj04;
	    Vendor vendorObj05;
	  
	
	    vendorObj01 = new Vendor(0,0); 		// 0 cent price, 0 inventory
	    vendorObj02 = new Vendor(0,10);		// 0 cent price, 10 inventory
	    vendorObj03 = new Vendor(10,0);		// 10 cent price, 0 inventory
	    vendorObj04 = new Vendor(10,10);		// 10 cent price, 10 inventory
	    vendorObj05 = new Vendor(10,10);		// 10 cent price, 10 inventory
	    
  	    
  	  
	    // constructor tests
	    
	    // initial getStock tests (constructor test)
	    testCount ++; // up test count
	    
	    if (testObj01.getStock() != vendorObj01.getStock()){
			System.out.println("Constructor getStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getStock(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj02.getStock() != vendorObj02.getStock()){
			System.out.println("Constructor getStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getStock(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj03.getStock() != vendorObj03.getStock()){
			System.out.println("Constructor getStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getStock(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj04.getStock() != vendorObj04.getStock()){
			System.out.println("Constructor getStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getStock(): " + testCount + ": PASS");
		}
	    
	    
	    // initial getChange tests (constructor test)
	    testCount ++; // up test count
	    
	    if (testObj01.getChange() != vendorObj01.getChange()){
			System.out.println("Constructor getChange(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getChange(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj02.getChange() != vendorObj02.getChange()){
			System.out.println("Constructor getChange(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getChange(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj03.getChange() != vendorObj03.getChange()){
			System.out.println("Constructor getChange(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getChange(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj04.getChange() != vendorObj04.getChange()){
			System.out.println("Constructor getChange(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getChange(): " + testCount + ": PASS");
		}
	    
	    // initial getDeposit tests (constructor test)
	    testCount ++; // up test count
	    
	    if (testObj01.getDeposit() != vendorObj01.getDeposit()){
			System.out.println("Constructor getDeposit(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getDeposit(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj02.getDeposit() != vendorObj02.getDeposit()){
			System.out.println("Constructor getDeposit(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getDeposit(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj03.getDeposit() != vendorObj03.getDeposit()){
			System.out.println("Constructor getDeposit(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getDeposit(): " + testCount + ": PASS");
		}
	    
	    testCount ++; // up test count
	    
	    if (testObj04.getDeposit() != vendorObj04.getDeposit()){
			System.out.println("Constructor getDeposit(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("Constructor getDeposit(): " + testCount + ": PASS");
		}
	    
	    // setStock tests
	    
	    
	    testObj01.setStock(100); // set stock value
	    vendorObj01.setStock(100); // set stock value
	    
	    // did stock change?
	    if (testObj01.getStock() != vendorObj01.getStock()){
			System.out.println("setStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("setStock(): " + testCount + ": PASS");
		}
	    
	    // did deposit change after setting stock?
	    testCount ++; // up test count
	    
	    if (testObj01.getDeposit() != vendorObj01.getDeposit()){
			System.out.println("setStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("setStock(): " + testCount + ": PASS");
		}
	    
	    // did change change after setting stock?
	    testCount ++; // up test count
	    
	    if (testObj01.getChange() != vendorObj01.getChange()){
			System.out.println("setStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("setStock(): " + testCount + ": PASS");
		}
	    
	    // addMoney tests
	    
	    testCount ++; // up test count
	    
	    testObj01.addMoney(100); // add money
	    vendorObj01.addMoney(100); // add money
	    
	    // did stock change?
	    if (testObj01.getStock() != vendorObj01.getStock()){
			System.out.println("setStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("setStock(): " + testCount + ": PASS");
		}
	    
	    // did deposit change after making deposit?
	    testCount ++; // up test count
	    
	    if (testObj01.getDeposit() != vendorObj01.getDeposit()){
			System.out.println("setStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("setStock(): " + testCount + ": PASS");
		}
	    
	    // did change change after making deposit?
	    testCount ++; // up test count
	    
	    if (testObj01.getChange() != vendorObj01.getChange()){
			System.out.println("setStock(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("setStock(): " + testCount + ": PASS");
		}
	    
	    // makeSale tests
		
		// no inventory
	    testCount ++; // up test count
	    testObj03.addMoney(15);
	    testObj03.setStock(0);
	    vendorObj03.addMoney(15);
	    vendorObj03.setStock(0);
	    
	    System.out.println("deposit: " + testObj03.getDeposit());
	    System.out.println("change: " + testObj03.getChange());
	    System.out.println("stock: " + testObj03.getStock());

	    
	    if (!testObj03.makeSale() == vendorObj03.makeSale()){
			System.out.println("makeSale(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("makeSale(): " + testCount + ": PASS");
		}
	    
	    // price less than deposit with inventory
	    testCount ++; // up test count
	    testObj03.addMoney(0);
	    testObj03.setStock(1);
	    vendorObj03.addMoney(0);
	    vendorObj03.setStock(1);
	    
	    System.out.println("deposit: " + testObj03.getDeposit());
	    System.out.println("change: " + testObj03.getChange());
	    System.out.println("stock: " + testObj03.getStock());
	    
	    if (!testObj03.makeSale() == vendorObj03.makeSale()){
			System.out.println("makeSale(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("makeSale(): " + testCount + ": PASS");
		}
	    
	    // price greater than deposit
	    testCount ++; // up test count
	    testObj03.addMoney(15);
	    testObj03.setStock(1);
	    vendorObj03.addMoney(15);
	    vendorObj03.setStock(1);
	    
	    System.out.println("deposit: " + testObj03.getDeposit());
	    System.out.println("change: " + testObj03.getChange());
	    System.out.println("stock: " + testObj03.getStock());
	    
	    if (!testObj03.makeSale() == vendorObj03.makeSale()){
			System.out.println("makeSale(): " + testCount + ": FAIL");
			failCount ++;
		} 
		else {
			System.out.println("makeSale(): " + testCount + ": PASS");
		}
	    
	    // test summary
	 	System.out.println();
	 	System.out.println("*****   TEST SUMMARY     *****");
	 	System.out.println("Total points:   " + TOTALPOINTS);
	 	System.out.println("Tests:          " + testCount);
	 	System.out.println("Failed:         " + failCount);
	 	
	 	
	 	percentPass = (double) (testCount - failCount) / testCount * 100;
	 	earnedPoints =  percentPass * TOTALPOINTS / 100;
	 	System.out.println("Percent passed: " + Math.round(percentPass) + "%");
	 	System.out.println("Points earned:  " + Math.round(earnedPoints));
  		
  		
  	}
  	
  
}
