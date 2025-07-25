//Write a program to print the following pattern
//1 0 1 0 
//0 1 0 1
//1 0 1 0


package com.gqt.corejava.Patterns;
import java.util.Scanner;

public class Challenge_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = sc.nextInt();
		System.out.println("Enter the col size: ");
		int col = sc.nextInt();

		
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				System.out.print((i+j)%2 + " ");
				 
			 }
			 System.out.println();
		 }
		

	}

}
