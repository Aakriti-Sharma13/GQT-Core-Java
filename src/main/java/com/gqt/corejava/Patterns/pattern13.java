package com.gqt.corejava.Patterns;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		
		int n= sc.nextInt();
		int a;
		
		
		for(int i=1; i<=n; i++) {
			a=i;
			for(int j=1; j<=n; j++) {
				System.out.print(i+" ");
				a=a++;
				
			}
			System.out.println(a+" ");
			
			
		}

	}

}
