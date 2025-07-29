package com.gqt.corejava.Patterns;
import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        sc.close();

	        for (int i = 1; i <= n; i++) {
	            // leading spaces
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print(" ");
	            }
	            // stars with spaces
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}
	








	