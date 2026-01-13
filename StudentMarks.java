package marks;

public class StudentMarks {
	
	public static void main(String[] args) {
		
		int marks = 100;
		
		
		try {
			if(marks < 0 || marks>100) {
				
				throw new InvalidMarksException("Invalid Marks");
				
			}
			
			System.out.println("Marks Saved Successfully");
			
		} catch (InvalidMarksException e ) {
			System.out.println(e.getMessage());
		}
	}

}

class InvalidMarksException extends RuntimeException{
	public InvalidMarksException(String i) {
		super (i);
	}
}
