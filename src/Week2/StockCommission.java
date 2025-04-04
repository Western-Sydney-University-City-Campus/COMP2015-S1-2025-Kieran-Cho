package test;
import java.util.Scanner;  // Import the Scanner class

public class StockCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the share price");
	    double sharePrice = scan.nextDouble();  // Read user input
	    if(sharePrice < 1 || sharePrice > 500) {
	    	System.out.println("Share price must be between 1 and 500");
	    }
	    else {
	    	System.out.println("Enter the number of shares");
		    double numberOfShares = scan.nextDouble();  // Read user input
		    if(numberOfShares < 100 || numberOfShares > 100000) {
		    	System.out.println("Number of shares must be between 100 and 100,000");
		    }
		    double stockCost = sharePrice * numberOfShares;
		    double commission = 0.1;
		    double total = stockCost * (1 + commission);
		    
		    System.out.println("Stock Cost is:" + stockCost);
		    System.out.println("Commission is:" + commission);
		    System.out.println("Total is:" + total);
	    }
	    
	    
	    
	}

}
