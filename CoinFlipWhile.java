import java.util.Scanner;

public class CoinFlipWhile {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String coin, ready, again = "no"; 
		
		int streak = 0;
		
		boolean gotHeads;
		
		gotHeads = Math.random() < 0.5; 

		System.out.println("Are you ready to flip a coin?");
		ready = keyboard.next();
		
		while ( ! ready.equals("yes")) {
			System.out.println("Are you ready now?");
			ready = keyboard.next();
			}
		
		if (gotHeads) {
			coin = "HEADS";
			again = "yes";
		}
		else {
			coin = "TAILS";
			System.out.println("You flip a coin and it is " + coin);
		}
		
		while ( coin.equals("HEADS") && again.equals("yes") ) {
			streak++;
			System.out.println("You flip a coin and it is " + coin);
			System.out.println("That's "+streak+" times in a row!");
			System.out.println("Would you like to flip again?");
			again = keyboard.next();
			
			if (Math.random() < 0.5) {
				coin = "HEADS";
			}
			else {
				coin = "TAILS";		
			}
		}		
		
		while ( coin.equals("TAILS") && streak > 0 ) {
			System.out.println("You lose. That's a shame");
			streak = 0;
			again = "no"; 
		}
		
		while (again.equals("yes")); 

		System.out.println("Your final score is: " + streak);
		
		}
	}

		