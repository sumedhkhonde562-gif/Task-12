package all;

import java.util.Scanner;

public class CalculateTotalMarks {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int total =0;
		
		for(int i = 0; i<n; i++) {
			total +=sc.nextInt();
		}
		
		System.out.println("Total Marks : "+ total);
	}
	

}
