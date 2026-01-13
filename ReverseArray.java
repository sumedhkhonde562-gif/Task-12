package array;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= {101,102,103,104,105};
		
		for(int i = 0;i<n ;i++)
			a[i]= sc.nextInt();
		
		
		System.out.println("Reversed Array:");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		System.out.println("Reversed Array: ");
		for(int i = n - 1; i>=0;i--)
			System.out.println(a[i]+" ");
	}

}
