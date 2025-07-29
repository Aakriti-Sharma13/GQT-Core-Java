/**
 * @author ankita
 * @description This is an example for conditional pattern
 */
package com.gqt.corejava.Patterns;
import java.util.Scanner;

/**
 * # 
 * # #
 * # - #
 * # - - #
 * # # # # #
 */
public class Pattern39 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n =sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(i==0 || i==j || i==(n-1) || j==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
				
			}
			System.out.println();
		}
		

	}

}
