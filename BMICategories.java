import java.util.Scanner;

public class BMICategories {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lbs, kg, m, bmi;
		
		System.out.print( "Your height (feet only):" );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height (inches):" );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		
		kg = lbs*0.453592;
		
		m = (ft*12 + in)*0.0254;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );				
		
		System.out.println( "BMI Category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight");
		}
		else if ( bmi < 35.0) {
			System.out.println( "moderately obese" );
		}
		else if (bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}	