package e7;
public class e7 {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e7 registration = new e7();
		
		try {
			registration.registerUser("Mickey", "US");
		} catch (InvalidCountryException e) {
		}
	}

}