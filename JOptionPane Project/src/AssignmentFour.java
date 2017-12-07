import javax.swing.JOptionPane;

public class AssignmentFour {
	public static void main(String[] args) {
		String input;
		String menu;
		char choice;

		menu = ("A. Land Enclosure\n" + "B. Pay Calculator\n" + "C. Best Deal\n" + "Q. Quit the program");

		input = JOptionPane.showInputDialog(menu, "Select");
		input = input.toUpperCase();
		choice = input.charAt(0);

		switch (choice) {
		case 'A': // Land Enclosure
			PartA.landEnclosure();
			break;

		case 'B':
			PartB.payCalculator();
			break;
		case 'C':
			PartC.bestDeal();
			break;
		case 'Q':
			JOptionPane.showMessageDialog(null, "Goodbye");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Please enter a letter corresponding to an option.");
			break;
		}
	}

}
