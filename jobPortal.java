package demo;

public class jobPortal {

	static void register(int age) throws InvalidAgeException{
		if(age < 21 || age > 35) {
			
			throw new InvalidAgeException("Invalid age .Registeation failed.");
			
			
		}
		
		System.out.println("Registration successful");
	}
}
