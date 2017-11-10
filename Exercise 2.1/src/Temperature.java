// Filename: Temperature.java
public class Temperature {

	public static void main(String[] args) {
		
		double fahrenheit = 62.5;
		
		// Convert
		double celsius = f2c(fahrenheit);
		
		System.out.println(fahrenheit + "F" + " = " + celsius + "C");
		
		// Alternative to display only 2 decimal places
		System.out.printf(fahrenheit + "F" + " = " + "%.2f" + "C", celsius);
	}
	
	public static double f2c(double fahr) {
		return (fahr - 32) * 5 / 9;
	}
	
}
