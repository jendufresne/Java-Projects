import javax.swing.JOptionPane;

public class PayCalculator {
	public static void main(String[] args) {
		String input;
		input = JOptionPane.showInputDialog("How many knives did you sell this month?");

		int userInput = Integer.parseInt(input);

		/*
		 * Pay scale
		 * 
		 * # of Knives Sold | Pay 
		 * -----------------|---------
		 *  0 <= x >= 100 	| $5 * (x) 
		 *  101 <= x >= 200 | $10 * (x) 
		 *  x > 200 		| $15 * (x)
		 */
		int tierATotal = 500; // variable used if user sold more than 100 knives
								// ($5 * 100) = 500
		int tierABTotal = 1500; // variable used if user sold more than 200
								// knives ($5 * 100) + ($10 * 100) = 1500

		if (userInput >= 0 && userInput <= 100) {
			int amountMade = userInput * 5;

			JOptionPane.showMessageDialog(null, "You made $" + amountMade + " selling knives this month.");
		} // end if (input <= 100)

		else if (userInput >= 101 && userInput <= 200) {
			int tierBNum = userInput - 100;
			int amountMade = tierATotal + (tierBNum * 10);
			JOptionPane.showMessageDialog(null, "You made $" + amountMade + " selling knives this month.");
		} // end else if(input >= 101 && <= 200)

		else if (userInput > 200) {
			int tierCAmount = userInput - 200;
			int amountMade = tierABTotal + (tierCAmount * 15);
			JOptionPane.showMessageDialog(null, "You made $" + amountMade + " selling knives this month.");
		} // end else if(input >200)
		else {
			JOptionPane.showMessageDialog(null,
					"Error. Please make sure that you enter a positive whole number less than 1,000,000.");
		}
	} //
}
