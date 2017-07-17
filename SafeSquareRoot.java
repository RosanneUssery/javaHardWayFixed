import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String yes;
		double x, y;
		
		System.out.println("We're going to find square roots! Yay!");
		System.out.println("ARE YOU READY?");
		yes = keyboard.next();
		
		while ( ! yes.equals("YES!") ){
			System.out.println("Show me some more enthusiasm!");
			yes = keyboard.next();
		}
				
		System.out.println("Give me a number, and I'll find its square root. ");
		System.out.println("(No negatives, please.) " );
		x = keyboard.nextDouble();
		
		while (x < 0) {
			System.out.print("I won't take the square root of a negative.");
			System.out.print("\nNew Number: ");
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of "+x+" is "+y);
	}
} /* I changed some of the print/printlns so that it looked nicer in the
	terminal. These have no effect on the while statements. Just cosmetic. */