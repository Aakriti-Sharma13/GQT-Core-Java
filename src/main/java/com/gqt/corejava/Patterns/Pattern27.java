package com.gqt.corejava.Patterns;
import java.util.Scanner;


public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for(int k=i-1; k>=1; k--) {
				System.out.print(k);
		}
		System.out.println();	
		
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for(int k=i-1; k>=1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
