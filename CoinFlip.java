import java.util.Scanner;

public class CoinFlip {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String coin, again;
		int streak = 0;
		boolean gotHeads;
		
		gotHeads = Math.random() < 0.5;
		
		
		while ( gotHeads = true) {
			System.out.println("You got Heads!");
			System.out.println("Would you like to flip again? (y/n)" );
			again = keyboard.next();
			
			if (again.equals("y") ) {
				if ( gotHeads = false) {
				System.out.println("You got Tails!");
				}
				if (gotHeads = true) {
				System.out.println("You got Heads!");
				}					
			}
			if (again.equals("n") ) {
				System.out.println("That's "+streak+" wins!");
			
			
			
		while ( gotHeads = false); {
			System.out.println("You got TAILS!");
			System.out.println("You lose! Waah wahh.");	
		}				
	}		
		//System.out.println("You flip a coin and it is..." +coin);

		
		/* 7/17 super stuck on this. Going to give it until Tomorrow or Wednesday
			to figure out out. On to writing!*/
		
		/*do {
			gotHeads = Math.random() < 0.5;
			
			if ( gotHeads )
				coin = "HEADS";
			else 
				coin = "TAILS";
			
			System.out.println("You flip a coin and it is... "+coin);
			
			if ( gotHeads ) {
				streak++;
				System.out.println("\tThat's "+streak+ " in a row....");
			
				System.out.print("\tWould you like to flip again (y/n)? ");
				again = keyboard.next();
			}
			
			else {
				System.out.println("\tYou lose everything!");
				System.out.println("\tShould've quit while you were aHEAD....");
				streak = 0;
				again = "n";
			}
		} while ( again.equals("y") );
		
		System.out.println("Final score: " + streak);*/
	}
}