import javax.swing.JOptionPane;

public class PartC {
	public static void bestDeal() {
		String input;
		input = JOptionPane.showInputDialog("How much money is left on the card in dollars)?");
		int cardAmount = Integer.parseInt(input);
		if (cardAmount > 0 && cardAmount < 1000) {
			input = JOptionPane.showInputDialog("What is the cost in dollars of the three items you may buy?");
			String[] itemsPrices = input.split(" ");

			int itemA = Integer.parseInt(itemsPrices[0]);
			int itemB = Integer.parseInt(itemsPrices[1]);
			int itemC = Integer.parseInt(itemsPrices[2]);

			int leftOver = cardAmount;

			if (itemA > 0 && itemA < 1000 && itemB > 0 && itemB < 1000 && itemC > 0 && itemC < 1000) {
				if(cardAmount - itemA >= 0 && cardAmount - itemA < leftOver){
					leftOver = cardAmount - itemA;
				}
				if(cardAmount - itemB >= 0 && cardAmount - itemB < leftOver){
					leftOver = cardAmount - itemB;
				}
				if(cardAmount - itemC >= 0 && cardAmount - itemC < leftOver){
					leftOver = cardAmount - itemC;
				}
				if(cardAmount - (itemA + itemB) >= 0 && cardAmount - (itemA + itemB) < leftOver){
					leftOver = cardAmount - (itemA + itemB);
				}
				if(cardAmount - (itemA + itemC) >= 0 && cardAmount - (itemA + itemC) < leftOver){
					leftOver = cardAmount - (itemA + itemC);
				}
				if(cardAmount - (itemB + itemC) >= 0 && cardAmount - (itemB + itemC) < leftOver){
					leftOver = cardAmount - (itemB + itemC);
				}
				if(cardAmount - (itemA + itemB +itemC) >= 0 && cardAmount - (itemA + itemB +itemC) < leftOver){
					leftOver = cardAmount - (itemA + itemB + itemC);
				}
				JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + leftOver);
			} else if (cardAmount == 0) {
				JOptionPane.showMessageDialog(null, "You do not have any money on your card");
			} else {
				JOptionPane.showMessageDialog(null,
						"Error. Please enter your values as positive whole dollar amounts. Items must be less than $1000.");
			}
		}
	}
}
