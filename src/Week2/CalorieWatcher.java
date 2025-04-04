package test;
import java.util.Scanner;  // Import the Scanner class

public class CalorieWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the number of cookies eaten");

	    int numberCookies = scan.nextInt();  // Read user input
	    if(numberCookies <= 0) {
	    	System.out.println("You must enter at least one cookie");
	    }
	    else if(numberCookies > 0) {
	    	int serveConsumed = numberCookies/40 * 10;
		    int totalCalories = serveConsumed * 300;
		    System.out.println("You consumed " + totalCalories + " when you ate " + numberCookies + " cookies.");  // Output user input
	    }
	    
	    
	    scan.close();
	    
	    
	}

}
