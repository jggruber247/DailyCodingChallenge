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
		int[] example1 = {2,4,6,2,5};
		int[] example2 = {5,1,1,5}; 
		int[] example3 = {0,4,5,3,2}; 
		System.out.println("Example 1:  " + Arrays.toString(example1));
		int sum1 = nonAdjSumFinder(example1);
		System.out.println("Ex1 Output: " + sum1);
		System.out.println("");
		System.out.println("Example 2:  " + Arrays.toString(example2));
		int sum2 = nonAdjSumFinder(example2);
		System.out.println("Ex2 Output: " + sum2);
		System.out.println("");
		System.out.println("Example 3:  " + Arrays.toString(example3));
		int sum3 = nonAdjSumFinder(example3);
		System.out.println("Ex3 Output: " + sum3);
	}

	public static int nonAdjSumFinder(int[] list) {
		int finalSum=0;
		int[] aList;
		aList = list.clone();
		
		
		
		
		
		
		
		
		
		return finalSum;
	}
	
}
