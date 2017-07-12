import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lbs, kg, m, bmi;
		
		System.out.print( "Your hight (feet only):" );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height (inches):" );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		
		kg = lbs*0.453592;
		
		m = (ft*12 + in)*0.0254;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}