/*
 * Written by Diana Sen 
 * If you are in the restorant and need to pay tip
 * (any persantage) but do not know how much it will be 
 * This program is for you!
 */
/*
 * 
 */
package tip_calculator;

import java.util.Scanner;

public class TipCalculator {
	
	public static void main(String args[]) {
		
    Scanner keyboard = new Scanner(System.in);
 
    System.out.print("Enter the meal price: ");
    double total = keyboard.nextDouble();
    
    System.out.print("Enter tip percentage desired to pay: ");
    double tip_desired = keyboard.nextDouble();
 
    double tip_to_dec = tip_desired / 100;
    double tip = total*tip_to_dec;
    tip = (double) Math.round(tip * 100) / 100;
    
    System.out.println(tip_desired + "%" + " tip will cost you: " + tip + "$");
    
    System.out.println("Total price for meal (meal + tip) will be: " + (tip + total) + "$");
  }
}