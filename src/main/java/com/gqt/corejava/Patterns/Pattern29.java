package com.gqt.corejava.Patterns;
import java.util.Scanner;
public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.close();

         // Top half including middle
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // repeated numbers
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //  Bottom half
        for (int i = 2; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // repeated numbers
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

	}

}
