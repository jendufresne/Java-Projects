import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class SevenB {
	public static void main(String[] args) {
		String input;
		String menu;
		char choice = 'a';
		String[] library = new String[100];
		int librarySize = 0;
		String title;

		while (choice != 'Q') {
			menu = ("A. View your library\n" + "B. Search your library\n" + "C. Add a title\n" + "D. Remove a title\n"
					+ "Q. Quit the program");

			input = JOptionPane.showInputDialog(menu, "Select");
			if (input != null) {
				input = input.toUpperCase();
				choice = input.charAt(0);
			}

			switch (choice) {
			case 'A': // View Contents and sort
				Library.sort(library, librarySize);
				JOptionPane.showMessageDialog(null, library);
				break;
			case 'B': // Search
				title = JOptionPane
						.showInputDialog("What title would you like to search in your library? Enter q to quit.");
				if (Library.search(title, library, librarySize) >= 0) {
					JOptionPane.showMessageDialog(null, title + " is in your library.");
				} else {
					JOptionPane.showMessageDialog(null, title + " is not in your library.");
				}
				break;

			case 'C': // Add item

				title = JOptionPane
						.showInputDialog("What title would you like to add to your library? Enter q to quit.");
				library = Library.addTitle(title, library, librarySize);
				librarySize++;
				break;
			case 'D': // Remove item
				title = JOptionPane
						.showInputDialog("What title would you like to remove from your library? Enter q to quit.");
				library = Library.removeTitle(title, library, librarySize);
				librarySize--;
				break;
			case 'Q':
				break;

			default:
				JOptionPane.showMessageDialog(null, "Please enter a letter corresponding to an option.");

			}

			if (choice == 'Q') {
				JOptionPane.showMessageDialog(null, "Goodbye");

			}

		}

	}
}
