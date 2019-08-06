/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * August 6, 2019
 *
 * PROBLEM:
 * Given an integer k and a string s, find the length of the 
 * longest substring that contains at most k distinct characters. 
 * For example, given s = "abcba" and k = 2, the longest substring 
 * with k distinct characters is "bcb".
 * ---------------------------------------------------------
 */
public class DistinctCharSubString {

	public static void main(String[] args) {
		// Creating examples
		String ex1 = "abcba";
		int ex1k = 2;
		String ex2 = "abcdcba";
		int ex2k = 3;
		
		// Printing the examples and the outputs they equate to
		System.out.println("Example String 1: \"" + ex1 + "\"");
		String subStr1 = longestString(ex1,ex1k);
		int subLen1 = subStr1.length();
		System.out.println("Substring Length:  " + subLen1);
		System.out.println("Longest SubString: " + subStr1);
		System.out.println("");
		
		System.out.println("Example String 2: \"" + ex2 + "\"");
		String subStr2 = longestString(ex2,ex2k);
		int subLen2 = subStr2.length();
		System.out.println("Substring Length:  " + subLen2);
		System.out.println("Longest SubString: " + subStr2);
		System.out.println("");
		
		
	}

	public static String longestString(String s, int k) {
		String ls = "";
		
		
		
		

		return ls;
	}
	
	
}
