/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * July 24, 2019
 *
 * PROBLEM:
 * Take an inputed miles value, convert it to kilometers, 
 * and display the result using printf().
 * ---------------------------------------------------------
 */

import java.util.Scanner;
public class MilesToKilos {

	public static void main(String[] args) {
		float miles, km;
		final double KM_RATIO = 1.60935;
		
		Scanner sc = new Scanner(System.in);
		
		// Input the mile value
		System.out.println("How many miles would you like to convert?");
		miles = sc.nextFloat();
		km = (float) (miles * KM_RATIO);   // Converting miles to kilometers
		
		// Display the converted value
		System.out.println();
		System.out.print(miles);
		System.out.printf(" miles is equivalent to %2.5f kilometers.%n", km);
		
		sc.close();
	}
	
}