import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age, tea;
		double weight,income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		/* Putting an integer or a double here does nothing
			this is because numbers can be part of strings with no issue */
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		// Putting a double here makes the program sad. 
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		/* Putting an integer here does nothing because it auto-converts it to a double.
		 	But! If you put a string or a fraction (1/2) in here, it breaks it and makes
		 	it sad. :( 
		 */
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		/* This also breaks if you put in a symbol that's not strictly a number.
			e.g. $
		*/
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
			
		System.out.print( "How many cups of tea do you drink a day?" );
		tea = keyboard.nextInt();
		// 5 and it worked because it's an integer, not a double or string.
		System.out.println( tea + "! That's a lot of caffeine!" );
		
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
	}
}