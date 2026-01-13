package core;

import java.util.Scanner;
import java.util.Arrays;

public class LargestElement {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);   // sort array

        System.out.println("Second Largest: " + a[n - 2]);
    }
	

}
