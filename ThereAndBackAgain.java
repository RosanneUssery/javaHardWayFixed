public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println( "Here.");
		erebor(); // removing the parentheses creates an error that it's not a statement
		System.out.println( "Back first time." );
		erebor(); //removing this removes the second there
		System.out.println( "Back second time." );
	}
	
	public static void erebor () {
		System.out.println( "There.") ;
	}
}
	