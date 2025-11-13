// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int num = Integer.parseInt(args[0]);
	String mode = args[1].toLowerCase();

	for ( int i = 1;  i <= num ; i++) {
		int sum = i ;
		int j = 1;
		String history = "";

		do {
			history += sum + " ";

			if (sum % 2 == 1) {
				sum = (sum * 3) + 1;
			} else {
				sum /= 2;
			}

			j++;
		} while (sum != 1);

		history = history + sum + " ";

		if (mode.equals("v")) {
			System.out.println(history + "(" + j + ")");
		}
		
	}

	System.out.println("Every one of the first "+ num +" hailstone sequences reached 1.");
	}
}
