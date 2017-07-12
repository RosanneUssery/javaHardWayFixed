public class ClubBouncer{
	public static void main( String[] args ) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club.");
		}
		System.out.println( "wheeeee!");
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}
// it didn't compile because the if must go after the else? It gave me an "else without if" error.
