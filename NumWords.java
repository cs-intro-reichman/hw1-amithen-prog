// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int hundreds = number / 100;
		int tens = (number % 100) / 10;
		int units = number % 10;
		// print in a way of 5 hundreds, 1 tens, and 7 ones.
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units + " ones.");
	}
}
