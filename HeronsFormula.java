public class HeronsFormula {
	public static void main ( String[] args) {
		double a, g;
		String tws = "A triangle with sides ";
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3, 3, 3 has area " + a );
		
		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3, 4, 5 has area " + a);
		g = triangleArea(7, 8, 9);
		System.out.println(tws + "7,8,9 has area " + g );
		g = triangleArea(9, 9, 9);
		System.out.println(tws + "9, 9, 9 has area " + g);
		
		System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13) );
		System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11) );
		System.out.println(tws + "8,14,17 has area " + triangleArea(8, 15, 17) );
	}
	
	//Thus function computes the area of a triangle with side lengths, a, b , & c.
	public static double triangleArea( double a, double b, double c ) {
		double s, A;
		
		s = (a+b+c) /2;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		
		// After computing the area, you must "return: the completed value:
		return A;
		
		/*1. The version that doesn't use a function is longer. And more gross. Much more gross.
		  2. I changed the ints to doubles in the triangle area declaration and that allowed me
			to make the numbers be doubles (and thus have fractions). This would be incredibly
			hard to fix if I didn't use that function because I would have had to change it 
			in every instance of the thing, rather than just in the general declaration of
			the function.
		  3. The 9, 9, 9 formula was not hard to add, but I would have had to have done a 
		  	whole lot more work to get it to work without a function. Yay for functions!*/
	}
}