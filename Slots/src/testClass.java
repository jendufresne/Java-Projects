import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.math.*;

public class testClass {

	public static void main(String[] args) {

		String playerInput;
		String machineInput;
		String slotMenu;
		String playerMenu;
		int playerChoice = -1;
		int machineChoice = -1;

		String[] firstName = { "Vera", "Emma", "Liam", "Olivia", "Noah", "Ava", "Lucas", "Isabella", "Mason", "Sophia",
				"Oliver", "Mia", "Ethan", "Amelia", "Elijah", "Charlotte", "Logan", "Harper", "Aiden", "Aria",
				"Benjamin", "Ella", "James", "Abigail", "Alex", "Evelyn", "Jackson", "Emily", "Sebastian", "Avery",
				"Jacob", "Madison", "Scarlett", "Matthew", "Mila", "Jayden", "Sofia", "Chloe", "Lily", "Luke", "Riley",
				"Wyatt", "Layla", "Daniel", "Ellie", "William", "Zoey", "Gabriel", "Grace", "Grayson", "Carter", "Jack",
				"Sam", "Brendan", "Michael", "Nancy", "Jennifer" };
		String[] lastName = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
				"Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia",
				"Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Perez", "Hall", "Young",
				"Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker", "Adams", "Nelson", "Hill", "Ramirez",
				"Campbell", "Mitchell", "Roberts", "Carter", "Phillips", "Evans", "Turner", "Torres", "Parker",
				"Thompson", "Dufresne" };

		ArrayList<Player> players = new ArrayList(50);

		for (int i = 0; i < 50; i++) {
			int month = (int) Math.round(1 + (11 * Math.random()));
			int day = (int) Math.round(1 + (27 * Math.random()));
			int year = (int) Math.round(1900 + (95 * Math.random())); // must
																		// have
																		// been
																		// born
																		// before
																		// 1995
																		// to
																		// legally
																		// play
																		// slots
			int moneyBalance = (int) Math.round(1000 * Math.random());

			players.add(new Player(firstName[i], lastName[i], month, day, year, moneyBalance));
		}

		ArrayList<SlotMachine> slot = new ArrayList(3);

		slot.add(new SlotMachine("Lucky 777", 5000, 0.0001, 5000, 10000, 0.1, 5, 10));
		slot.add(new SlotMachine("Lucky Lotto", 55000, 0.00001, 75000, 100000, 0.02, 25, 50));
		slot.add(new SlotMachine("Purple People Eater", 1000, 0.02, 40, 50, 0.2, 2, 5));

		// Object[] playerArray = players.toArray();
		// playerInput = JOptionPane.showInputDialog(null, "Choose player",
		// "Slot Player", JOptionPane.QUESTION_MESSAGE, null, playerArray,
		// playerArray[0]); // Initial choice

		while (playerChoice != 0 || machineChoice != 0) {

			playerMenu = "0. Quit" + "\n" + "1. " + players.get(0).getPlayerName() + " balance: $"
					+ players.get(0).getMoneyBalance();

			for (int i = 1; i < 50; i++) {
				playerMenu = playerMenu + "\n" + (i + 1) + ". " + players.get(i).getPlayerName() + " balance: $"
						+ players.get(i).getMoneyBalance();
			}

			playerInput = JOptionPane.showInputDialog(playerMenu, "Select Player");
			playerChoice = Integer.parseInt(playerInput);
			int playerIndex  = playerChoice - 1;

			if (playerChoice != 0) {
				slotMenu = "0. Quit" + "\n" + "1. " + slot.get(0).getName() + "\n" + "2. " + slot.get(1).getName()
						+ "\n" + "3. " + slot.get(2).getName();

				machineInput = JOptionPane.showInputDialog(slotMenu, "Select Slot");
				machineChoice = Integer.parseInt(machineInput);
				int machineIndex = machineChoice - 1;
				
				players.get(playerIndex).playSlot();
				slot.get(machineIndex).machinePlayed();
				
				if(slot.get(machineIndex).checkJpWin() == true){
					players.get(playerIndex).setMoneyBalance(players.get(playerIndex).getMoneyBalance() + slot.get(machineIndex).getJpPay());
				}else if(slot.get(machineIndex).checkRegWin() == true){
					players.get(playerIndex).setMoneyBalance(players.get(playerIndex).getMoneyBalance() + slot.get(machineIndex).getRegPay());
				}else{
					JOptionPane.showMessageDialog(null, "You did not win. TRY AGAIN");
				}
				
				JOptionPane.showMessageDialog(null, players.get(playerIndex).getMoneyBalance() + "\n" + slot.get(machineIndex).getBalance() + "\n" + slot.get(machineIndex).getTimesPlayed());

				if (machineChoice != 0) {

				} else {
					int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Confirm Quit",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (result == JOptionPane.YES_OPTION)
						System.exit(0);
				}
			} else {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Confirm Quit",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);

				// if(players.get((playerChoice - 1)) == 0){
				//
				// }
			}

		}

	}
}
