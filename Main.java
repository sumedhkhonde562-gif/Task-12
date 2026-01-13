package demo;

public class Main {
	public static void main(String[] args) {
		try {
			 jobPortal.register(25);   // valid
	         jobPortal.register(40);
			
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
