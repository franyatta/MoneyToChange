//This program breaks a large amount of money into smaller units

import java.util.Scanner;

public class MrKrabsMoney {

	public static void main(String[] args) {
		
		// Prompt user for input
		System.out.print("Enter how much moolah you wanna convert: ");
		Scanner input = new Scanner(System.in);
		
		// Take in input
		double amount = input.nextDouble();
		input.close();
		
		// Dollars to cents
		int remainingAmount = (int) (amount * 100);
		
		// Dollars
		int dollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100; // % means remainder
		
		// Quarters
		int quarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Dimes
		int dimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Nickels
		int nickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Pennies
		int pennies = remainingAmount;
		
		// Output Results to Console
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
			
	}

}
// Franyatta