//55555
//4444
//333
//22
//1
package com.gqt.corejava.Patterns;
import java.util.Scanner;

public class Challenge_pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
	
		
		
		for(int i=5; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+ " ");
				i--;
			}
			System.out.println();
		}

	}

}
