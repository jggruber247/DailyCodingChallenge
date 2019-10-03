import java.util.Arrays;

/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * October 3, 2019
 *
 * PROBLEM:
 * Given a list of integers, return the largest product that 
 * can be made by multiplying any three integers.
 * For example, if the list is [-10, -10, 5, 2], we should 
 * return 500, since that's -10 * -10 * 5.
 * ---------------------------------------------------------
 */
public class LargestProduct {
 
	public static void main(String[]args) {
		// Creating the example lists
		int[] example1 = {-10,-10,5,2};
		int[] example2 = {1,2,3,4};
		
		// Printing the examples and the outputs they equate to
		System.out.println("Example 1:  \n" + Arrays.toString(example1));
		largestProductFinder(example1);
		System.out.println(" ");
		System.out.println("Example 2:  \n" + Arrays.toString(example2));
		largestProductFinder(example2);
		System.out.println(" ");
	}
	
	// 
	public static void largestProductFinder(int[] list) {
		int fOne = 0;
		int fTwo = 0; 
		int fThree = 0;
		int result = 0;
		
		
		
		
		System.out.println("Largest Product: " + result);
		System.out.println("Factors: " + fOne + ", " + fTwo + ", " + fThree);
		
	}
	
}
