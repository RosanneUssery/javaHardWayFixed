public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title, food1, food2, food3, statement;
		
		x = 10;
		y = 400;
		age = 39;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		
		food1 = "Chicken";
		food2 = "Liver";
		food3 = "Meow Mix";
		statement = "please deliver";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "I like " + food1 + ", I like " + food2 + ", " + food3 + food3 + statement + "!" );
	}
}