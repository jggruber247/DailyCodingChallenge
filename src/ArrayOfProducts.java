import java.util.Arrays;

/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * July 25, 2019
 *
 * PROBLEM:
 * Given an array of integers, return a new array such that each 
 * element at index i of the new array is the product of all the 
 * numbers in the original array except the one at i. 
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected 
 * output would be [120, 60, 40, 30, 24]. If our input was 
 * [3, 2, 1], the expected output would be [2, 3, 6].
 * ---------------------------------------------------------
 */

public class ArrayOfProducts {

	public static void main(String[] args) {
		// Creating the example lists
		int[] example1 = {1,2,3,4,5};
		int[] example2 = {3,2,1};
		
		// Printing the examples and the outputs they equate to
		System.out.println("Example 1: " + Arrays.toString(example1));
		int[] example1p = productArray(example1);
		System.out.println("Example 1 Output: " + Arrays.toString(example1p));
		System.out.println("");
		System.out.println("Example 2: " + Arrays.toString(example2));
		int[] example2p = productArray(example2);
		System.out.println("Example 2 Output: " + Arrays.toString(example2p));
	}

	// Method for returning the array described in the problem
	public static int[] productArray(int[] arr) {
		int[] pArr;
		pArr = arr.clone();
		int len = pArr.length;
		for(int i = 0; i < len; i++) {
			int prod = 1;
			for(int j = 0; j < len; j++) {
				if(i != j) {
					prod = prod * arr[j];
				}
			}
			pArr[i] = prod;
		}
		return pArr;
	}
}
