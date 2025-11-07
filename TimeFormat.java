// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Now, we convert the 24-hour format to the 12-hour AM/PM format.
		String period = "AM";

		// if bigger then 12
		if (hours >= 12) {
			period = "PM";
		}

		// if bigger then 12 (for example 17:00) → subtract 12 to convert to 12-hour format
		if (hours > 12) {
			hours = hours - 12;
		}

		// if hours is 00 → this is midnight (0:xx AM)
		if (hours == 0) {
			hours = 0;
		}

		// printing in format
		System.out.print(hours + ":");
		// if minutes is less than 10, add 0 before the number (for example 5 → 05)
		if (minutes < 10) {
			System.out.print("0");
		}
		System.out.print(minutes + " " + period);
	
	}
}
