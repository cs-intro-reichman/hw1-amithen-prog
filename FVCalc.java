// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentvalue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double amount = currentvalue;
		amount = amount * Math.pow(1 + rate/100, n);
		// prints 2 years, $100 saved at 10.0% will yield $121
		System.out.println("after " +(int) n + " years, $" + currentvalue + " saved at " + rate + "% will yield $" + amount);
	}
}