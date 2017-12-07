import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		String startMenu;
		String addPlayerMenu;
		
		String athleteMenu;
		String input;
		String name;
		char choice = 'q';
		int arraySize = 15;
		Person[] people = new Person[1000]; 

		BaseballPlayer hank = new BaseballPlayer(1, "both", "Hank", "Williams", 67, "Yankees", "Outfield");
		people[0] = hank; 

		BaseballPlayer barry = new BaseballPlayer(5, "right", "Barry", "Garry", 19, "UF", "Pitcher");
		people[1] = barry; //polymorphism

		BaseballPlayer tim = new BaseballPlayer(1, "left", "Tim", "Tebow", 29, "St. Lucie Mets", "Outfield");
		people[2] = tim; //polymorphism

		FootballPlayer aaron = new FootballPlayer("Offense", "Aaron", "Rogers", 33, "Packers", "QB");
		people[3] = aaron;

		FootballPlayer terry = new FootballPlayer("Defense", "Terry", "Jerry", 20, "Packers", "Lineman");
		people[4] = terry;

		FootballPlayer payton = new FootballPlayer("Offense", "Peyton", "Manning", 41, "Colts", "QB");
		people[5] = payton;

		HockeyPlayer mario = new HockeyPlayer("Baur", "Mario", "Bario", 32, "Penguins", "Goalie");
		people[6] = mario;

		HockeyPlayer wayne = new HockeyPlayer("Pure", "Wayne", "Dwyane", 20, "Solar Bears", "Center");
		people[7] = wayne;

		HockeyPlayer nico = new HockeyPlayer("CCM", "Nico", "Hischier", 19, "Devils", "Center");
		people[8] = nico;

		Golfer tiger = new Golfer("Travistock", "Tiger", "Woods", 42, "USA", "Golfer");
		people[9] = tiger;

		Golfer phil = new Golfer("Hilton", "Phil", "Collins", 56, "Golfer", "USA");
		people[10] = phil;

		Golfer adam = new Golfer("Rolex", "Adam", "Scott", 37, "Australia", "Golfer");
		people[11] = adam;

		SoccerPlayer cyle = new SoccerPlayer("Cyle", "Larin", 22, "Orlando City", "Forward", false);
		people[12] = cyle;

		SoccerPlayer graham = new SoccerPlayer("Graham", "Zusi", 30, "Kansas City", "Mid Fielder", false);
		people[13] = graham;

		SoccerPlayer brad = new SoccerPlayer("Brad", "Guzan", 32, "Atlanta United", "Goalie", false);
		people[14] = brad;

		startMenu = "A. Add a new Person" + "\n" + "B. Display all Person" + "\n"
				+ "C. Test to see of any two athletes are EQUAL" + "\n" + "D. Display what each athlete does" + "\n"
				+ "Q. Quit";

		addPlayerMenu = "A. Baseball" + "\n" + "B. Football" + "\n" + "C. Hockey" + "\n" + "D. Golf" + "\n"
				+ "E. Soccer" + "\n" + "0. Exit";

		while (choice != 'Q') {
			input = JOptionPane.showInputDialog(startMenu, "Select");

			if (input != null) {
				input = input.toUpperCase();
				choice = input.charAt(0);
			} else {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Confirm Quit",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);
			}

			switch (choice) {
			case 'A': // Add Athlete

				input = JOptionPane.showInputDialog(addPlayerMenu, "Select Sport");
				if (input != null) {
					input = input.toUpperCase();
					choice = input.charAt(0);

				} else {
					int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Confirm Quit",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (result == JOptionPane.YES_OPTION)
						System.exit(0);
				}

				switch (choice) {
				case 'A': // Baseball
					String firstName = JOptionPane.showInputDialog("First Name?");
					String lastName = JOptionPane.showInputDialog("Last Name?");
					input = JOptionPane.showInputDialog("Age?");
					int age = Integer.parseInt(input);
					String team = JOptionPane.showInputDialog("Team?");
					String position = JOptionPane.showInputDialog("Position?");
					input = JOptionPane.showInputDialog("Batting Position (Number)");
					int battingPosition = Integer.parseInt(input);
					String handedness = JOptionPane.showInputDialog("Handedness?");

					people[arraySize - 1] = new BaseballPlayer(battingPosition, handedness, firstName, lastName, age,
							team, position);
					arraySize++;
					break;

				case 'B': // Football
					firstName = JOptionPane.showInputDialog("First Name?");
					lastName = JOptionPane.showInputDialog("Last Name?");
					input = JOptionPane.showInputDialog("Age?");
					age = Integer.parseInt(input);
					team = JOptionPane.showInputDialog("Team?");
					position = JOptionPane.showInputDialog("Position?");
					String speciality = JOptionPane.showInputDialog("speciality?");

					people[arraySize - 1] = new FootballPlayer(speciality, firstName, lastName, age, team, position);
					arraySize++;
					break;

				case 'C': // Hockey
					firstName = JOptionPane.showInputDialog("First Name?");
					lastName = JOptionPane.showInputDialog("Last Name?");
					input = JOptionPane.showInputDialog("Age?");
					age = Integer.parseInt(input);
					team = JOptionPane.showInputDialog("Team?");
					position = JOptionPane.showInputDialog("Position?");
					String stickBrand = JOptionPane.showInputDialog("Stick Brand?");

					people[arraySize - 1] = new FootballPlayer(stickBrand, firstName, lastName, age, team, position);
					arraySize++;
					break;

				case 'D': // Golf
					firstName = JOptionPane.showInputDialog("First Name?");
					lastName = JOptionPane.showInputDialog("Last Name?");
					input = JOptionPane.showInputDialog("Age?");
					age = Integer.parseInt(input);
					team = JOptionPane.showInputDialog("Team?");
					position = JOptionPane.showInputDialog("Position?");
					String sponser = JOptionPane.showInputDialog("Main Sponser?");

					people[arraySize - 1] = new Golfer(sponser, firstName, lastName, age, team, position);
					arraySize++;
					break;

				case 'E': // Soccer
					firstName = JOptionPane.showInputDialog("First Name?");
					lastName = JOptionPane.showInputDialog("Last Name?");
					input = JOptionPane.showInputDialog("Age?");
					age = Integer.parseInt(input);
					team = JOptionPane.showInputDialog("Team?");
					position = JOptionPane.showInputDialog("Position?");
					input = JOptionPane.showInputDialog("Is the player suspended?");
					if (input.equals("true") || input.equals("True")) {
						boolean suspended = true;
						people[arraySize - 1] = new SoccerPlayer(firstName, lastName, age, team, position, suspended);
						arraySize++;
					} else if (input.equals("false") || input.equals("False")) {
						boolean suspended = false;
						people[arraySize - 1] = new SoccerPlayer(firstName, lastName, age, team, position, suspended);
						arraySize++;
					}

					break;

				case '0':
					JOptionPane.showMessageDialog(null, "No player added");

				default:

				}

				break;
			case 'B': // Display all
				for (int i = 0; i < arraySize; i++) {
					if (people[i] != null) {
						System.out.println(people[i]);
					}
				}

				break;

			case 'C': // Display if two Athletes are equal
				athleteMenu = "0. Quit" + "\n" + "1. " + people[0].getName();

				for (int i = 1; i < 50; i++) {
					athleteMenu = athleteMenu + "\n" + (i + 1) + ". " + people[i].getName();
				}

				input = JOptionPane.showInputDialog(athleteMenu, "Select Player 1");
				int athleteOneChoice = Integer.parseInt(input);
				int athleteOneIndex  = athleteOneChoice - 1;
				
				input = JOptionPane.showInputDialog(athleteMenu, "Select Player 2");
				int athleteTwoChoice = Integer.parseInt(input);
				int athleteTwoIndex  = athleteTwoChoice - 1;

				if(people[athleteOneIndex].equals(athleteTwoIndex) == true){
					JOptionPane.showMessageDialog(null, "The players are equal");
				}else{
					JOptionPane.showMessageDialog(null, "The players are not equal");
				}
				;
				break;
			case 'D': // Display what all athletes do
				for (int i = 0; i < arraySize; i++) {
					if (people[i] != null) {
						System.out.println(people[i].getName() + ":");
						people[i].doThis();
					}
				}

				break;
			case 'Q':
				JOptionPane.showMessageDialog(null, "Goodbye");
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Please enter a letter corresponding to an option.");
			}

		}
	}

}
