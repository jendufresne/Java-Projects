import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Library {

	public static String[] sort(String[] library, int librarySize) {

		for (int i = 1; i < librarySize; i++) {
			String temp = library[i];
			for (int j = i; j > -1; j--) {
				if (j != 0) {
					int result = temp.compareToIgnoreCase(library[j - 1]);
					if (result < 0) {
						library[j] = library[j - 1];
					} else {
						library[j] = temp;
						break;
					}
				} else {
					library[j] = temp;
				}

			}
		}

		return library;
	}

	public static String[] addTitle(String title, String[] library, int librarySize) {

		library[librarySize] = title;
		return library;
	}

	public static String[] removeTitle(String title, String[] library, int librarySize) {
		int location = search(title, library, librarySize);
		if (location >= 0) {
			for (int i = location; i < (librarySize - 1); i++) {
				library[i] = library[i + 1];
			}
			library[librarySize - 1] = null;
		} else {
			JOptionPane.showMessageDialog(null, "That title does not exist in your library.");
		}

		return library;
	}

	public static int search(String title, String[] library, int librarySize) {
		int location = -1;

		for (int i = 0; i < librarySize; i++) {
			if (title.equals(library[i])) {
				location = i;
			}
		}

		return location;
	}
}
