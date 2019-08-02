/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * August 2, 2019
 *
 * PROBLEM:
 * Given a list of integers, write a function that returns the
 * largest sum of non-adjacent numbers. Numbers can be 0 or 
 * negative. 
 * For example, [2, 4, 6, 2, 5] should return 13, since we 
 * pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we 
 * pick 5 and 5.
 * ---------------------------------------------------------
 */
import java.util.Arrays;

public class NonAdjacentSum {

	public static void main(String[] args) {
		// Creating the example lists
		int[] example1 = {2,4,6,2,5};
		int[] example2 = {5,1,1,5}; 
		int[] example3 = {0,4,-5,3,2,-1}; // Result should be 7
		
		// Printing the examples and the outputs they equate to
		System.out.println("Example 1:  " + Arrays.toString(example1));
		int sum1 = nonAdjSumFinder(example1);
		System.out.println("Largest Non-Adj Sum: " + sum1);
		System.out.println("");
		System.out.println("Example 2:  " + Arrays.toString(example2));
		int sum2 = nonAdjSumFinder(example2);
		System.out.println("Largest Non-Adj Sum: " + sum2);
		System.out.println("");
		System.out.println("Example 3:  " + Arrays.toString(example3));
		int sum3 = nonAdjSumFinder(example3);
		System.out.println("Largest Non-Adj Sum: " + sum3);
	}

	// Method for finding the largest sum of non-adjacent integers.
	public static int nonAdjSumFinder(int[] list) {
		int finSum=0;
		int[] aList;
		aList = list.clone();
		int len = aList.length;
		
		// These two sums will be calculated during the for loop and
			// the largest at the end is returned as 'finSum'.
		int inSum = aList[0]; // Largest Sum INCLUDING previous integer
		int exSum = 0; // Largest Sum EXCLUDING previous integer
		
		int exSumNew; // Temp value
		
		for(int i = 1; i < len; i++) {
			// 'exSumNew' becomes the larger of the two sums
			if(inSum > exSum) {
				exSumNew = inSum;
			}
			else {
				exSumNew = exSum;
			}
			inSum = exSum + aList[i];
			exSum = exSumNew;
		}
		
		// Determining the larger of the two sums
		if(inSum > exSum) {
			finSum = inSum;
		}
		else {
			finSum = exSum;
		}
		
		return finSum;
	}
	
}
