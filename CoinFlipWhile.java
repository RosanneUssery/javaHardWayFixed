import java.util.Scanner;

public class CoinFlipWhile {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String coin, ready, again = "no"; /* these are for output/input
								coin will show the result of the boolean argument
								again will show the result of the user input ("y/n")
								*/
		int streak = 1; /* This sets the streak initially to zero. From here it will
							be modified to reflect every time the result is HEADS. */
		boolean gotHeads; /* This will determine true/false for the result of the coin
							toss. */
		
		/* I will need two while statements. One to show the result of the coin toss
			and the other to work with the user input for again. */
		
		gotHeads = Math.random() < 0.5; /*I need this so I can make the random 
											true/false*/

		System.out.println("Are you ready to flip a coin?");
		ready = keyboard.next();
		
		while ( ! ready.equals("yes")) {
			System.out.println("Are you ready now?");
			ready = keyboard.next();
			
		
			if (gotHeads) {
				coin = "HEADS";
				streak++;
				System.out.println("You flip a coin and it is " + coin);
				System.out.println("That's "+streak+" times in a row!");
				System.out.println("You flip a coin and it is " + coin);
				System.out.println("Would you like to flip again?");
				again = keyboard.next();
			}
			else {
				coin = "TAILS";
				System.out.println("You flip a coin and it is " + coin);
				System.out.println("You lose. That's a shame");
		}
		}

			//When coin.equals Tails, it goes to line 47 and then loop errors
			//removing lines 40-49 makes lots of errors 
		}

		System.out.println("Your final score is: " + streak);
		
		}
	}
/* I will admit that I am completely lost on this one. I'm going to review the concepts
again and try next week.*/
		