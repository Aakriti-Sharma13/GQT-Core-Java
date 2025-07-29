package com.gqt.corejava.Patterns;
import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        sc.close();

	        for (int i = 0; i < n; i++) {
	            // spaces
	            for (int s = 1; s <= n - i - 1; s++) {
	                System.out.print(" ");
	            }

	            // descending numbers
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // center 0
	            System.out.print(0);

	            // ascending numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            System.out.println();
	        }

	}

}
