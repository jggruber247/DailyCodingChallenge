import java.util.Arrays;

/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * September 25, 2019
 *
 * PROBLEM:
 * Write a function that, given a set, generates its power set.
 * The power set of a set is the set of all its subsets.
 * For example, given the set {1, 2, 3}, it should return 
 * {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.
 * ---------------------------------------------------------
 */
public class PowerSet {

	public static void main(String[] args) {
		// Creating the example lists
		int[] example1 = {1,2,3};
		int[] example2 = {1,2,3,4};
		
		// Printing the examples and the outputs they equate to
		System.out.println("Example 1:  \n" + Arrays.toString(example1));
		System.out.println("Example 1 Power Set:");
		powerSetGen(example1);
		System.out.println(" ");
		System.out.println("Example 2:  \n" + Arrays.toString(example2));
		System.out.println("Example 2 Power Set:");
		powerSetGen(example2);
		
	}

	//method for generating the power set using bitwise operations
	public static void powerSetGen(int[] arr) {
		int len = arr.length;
		int powLen = 2^len;
		for (int i=0; i<powLen; i++) {
			System.out.print("{ ");
			int b = 1;
			for (int j=0; j<len; j++) {
				if ((i & b) > 0) {
					System.out.print("" + arr[j] + " ");
				}
			}
			System.out.println("}");
		}
		System.out.println("Number of sets in power set: " + powLen);
	}

}
