import java.util.Arrays;

/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * July 27, 2019
 *
 * PROBLEM:
 * Given an array of integers, find the first missing positive 
 * integer in linear time and constant space. In other words, 
 * find the lowest positive integer that does not exist in the 
 * array. The array can contain duplicates and negative numbers 
 * as well. For example, the input [3, 4, -1, 1] should give 2. 
 * The input [1, 2, 0] should give 3.
 * ---------------------------------------------------------
 */

public class MissingIntArray {

	public static void main(String[] args) {
		// Creating the example lists
		int[] example0 = {3,4,-1,1};
		int[] example1 = {1,2,3,6,5,7,8};
		int[] example2 = {1,2,0};
		
		// Printing the examples and the outputs they equate to
		System.out.println("Example 0:  " + Arrays.toString(example0));
		int missInt0 = missingIntFinder(example0);
		System.out.println("Ex0 Output: " + missInt0);
		System.out.println("");
		System.out.println("Example 1:  " + Arrays.toString(example1));
		int missInt1 = missingIntFinder(example1);
		System.out.println("Ex1 Output: " + missInt1);
		System.out.println("");
		System.out.println("Example 2:  " + Arrays.toString(example2));
		int missInt2 = missingIntFinder(example2);
		System.out.println("Ex2 Output: " + missInt2);
	}

	
	public static int missingIntFinder(int[] arr) {
		boolean exit = false;
		boolean pass = false;
		int[] pArr;
		int cnt = 1;
		int m = 1;
		pArr = arr.clone();
		int len = pArr.length;
		while(exit == false) {
			pass = false;
			for(int i=0;i<len;i++) {
				if(pass == false) {
					if(pArr[i]==cnt) {
						pass = true;
						m=pArr[i];
					}
				}
			}
			if(cnt > m) {
				exit = true;
				m++;
			}
			else {
				cnt++;
			}
		}
		return m;
	}
}
