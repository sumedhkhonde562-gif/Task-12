package array;

import java.util.Scanner;
public class MaximumSalary {
	
	public static void main(String[] args) {
		
		Scanner sk= new Scanner(System.in);
		
		int n = sk.nextInt();
		int max =0;
		
		
		for(int i = 0; i<n; i++) {
			
			int salary = sk.nextInt();
			
			if(salary > max)
				max = salary;
			
				
		}
		
		System.out.println("High Salary:"+ max);
		
	}
	

}
