// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double amount = principal;
		for (int i = 0; i < years; i++) {
			amount = amount * (1 + rate);
		}
		System.out.println("Future value: " + amount);
	}
}