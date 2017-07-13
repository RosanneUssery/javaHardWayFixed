import java.util.Scanner;

public class GenderTitlesInclusive {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String title;
		
		System.out.print( "First name: " );
		String first = keyboard.next();
		System.out.print( "Last name: " );
		String last = keyboard.next();
		System.out.print( "Gender (M/F/NB): " );
		String gender = keyboard.next();
		System.out.print( "Age: ");
		int age = keyboard.nextInt();
		
		if ( age < 20) {
			title = first;
		}
		
		else {
			if ( gender.equals("F") ) {
				System.out.print( "Are you married, " + first + "? (Y/N): " );
				String married = keyboard.next();
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}				
		else {
			if ( gender.equals("M") ) {
				title = "Mr.";
			}
				else {
					title = "Mx.";
				}
		}	
		System.out.println( "\n" + title + " " + last );
	}
}/* decided to add NB to see if I could make it default to something else.
	After a couple errors where I couldn't make my ifs match my elses in the
	compiler, I got it to work without being sad this way. */

}