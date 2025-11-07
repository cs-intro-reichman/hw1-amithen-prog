// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		//recive an int input from command line
		int range = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * range);

		int b = (int)(Math.random() * range);

		int c = (int)(Math.random() * range);

		// checks what is the smallest, middle, and largest number using math.min and math.max	

		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = a + b + c - min - max;
		// prints the generated numbers followed by the same numbers in ascending order.
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);
	}
}
