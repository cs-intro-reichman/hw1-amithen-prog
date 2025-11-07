// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 3);

		int num2 = (int)(Math.random() * 3());

		int num3 = (int)(Math.random() * 3);

		// Puts the numbers into increasing order:
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}

		// Prints the numbers:
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
