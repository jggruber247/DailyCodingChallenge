/* ---------------------------------------------------------
 * James Garrett Gruber
 * Daily Coding Challenge
 * July 24, 2019
 *
 * PROBLEM:
 * Given a list of 5 numbers and a number k, return whether 
 * any two numbers from the list add up to k. For example, 
 * given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * ---------------------------------------------------------
 */
import java.util.Scanner;

public class ListSumSearch {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, num5, k;
		System.out.println("Enter 5 integers seperated by spaces.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		System.out.println("Your List: [" + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + "]");
		System.out.println("Enter k.");
		k = sc.nextInt();
		int[] list = {num1,num2,num3,num4,num5};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i != j) {
					if(list[i] + list[j] == k) {
						System.out.println("" + list[i] + " + " + list[j] + " = " + k);
						list[i] = list[j];
					}
				}
			}
		}
		sc.close();
	}
	
}
