package login;

public class TestLogin {
	
	public static void main(String[] args) {
		
		int attempts = 0;
		
		
		try {
			for(int i =3; i<=4; i++) {
				attempts++;
				
				if(attempts <=3) {
					
					System.out.println("Invalid login attempt");
					
				} else {
					
					throw new LoginAttemptExceededException("Account locked");
					
				}
			}
		} catch (LoginAttemptExceededException e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
