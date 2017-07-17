import java.util.Scanner;

public class EnterPin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String typedPassword;
		int pin, entry;
		
		pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.println("ENTER YOUR PASSWORD: ");
		typedPassword = keyboard.next();
		
		while ( ! typedPassword.equals("password") ) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.println("ENTER YOUR PASSWORD: ");
			typedPassword = keyboard.next();
		}
		
		System.out.println("\nPASSWORD ACCEPTED.");
		System.out.println("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while ( entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
		
	}
}		
/* when I use "while ( ! typedPassword.equals("password") ); {
	the program refuses to let me use the correct password on the first try
	and then on the second try, lets me use whatever word to gain access to 
	the PIN section.*/
/* When I use while ( typedPassword.equals("password") ); {
	the program breaks and I have to restart terminal because it doesn't 
	progress to the next line after I've entered something. */
/* The problem was the ; after the second open parentheses.
	Removing that made the program run as appropriate.*/