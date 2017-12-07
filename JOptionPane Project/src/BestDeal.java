import javax.swing.JOptionPane;

public class BestDeal {
	public static void main(String[] args)
	{
		String input;
		input = JOptionPane.showInputDialog("How much money is left on the card in dollars)?");
		int cardAmount = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("What is the cost in dollars of the three items you may buy?");
		String [] itemsPrices = input.split(" ");
		
		int itemA = Integer.parseInt(itemsPrices[0]);
		int itemB = Integer.parseInt(itemsPrices[1]);
		int itemC = Integer.parseInt(itemsPrices[3]);
		
		if( cardAmount > 0 && cardAmount < 1000 && itemA > 0 && itemA < 1000 && itemB > 0 && itemB < 1000 && itemC > 0 && itemC < 1000)
		{
			if (cardAmount - itemA == 0 || cardAmount - itemB == 0 || cardAmount - itemC == 0 )
			{
				JOptionPane.showMessageDialog(null, "");
			}
			else if((cardAmount - itemA) > 0) // check if user can purchase item A
			{
				//items A
				//itemB
				//itemC
				int itemsAB = itemA + itemB;
				int itemsAC = itemA + itemC;
				int itemsBC = itemB + itemC;
				int itemsABC = itemA + itemB + itemC;
			} 
			else if ((cardAmount - itemB) > 0) // check if user can purchase item B, given not being able to buy item A
			{
				//item B
				// item C
				int itemsBC = itemB + itemC;
			} 
			else if ((cardAmount - itemC) > 0) // check if user can purchase item B, given not being able to buy item A or B
			{
				// only item C here
			}
			else if ((cardAmount - itemA) < 0 && (cardAmount - itemB) < 0 && (cardAmount - itemC) < 0)
			{
				JOptionPane.showMessageDialog(null, " The least amount of money you can leave on your card is $" + cardAmount);
			}
		}
		else if(cardAmount == 0)
		{
			JOptionPane.showMessageDialog(null, "You do not have any money on your card");
		}
		
		else 
		{
			JOptionPane.showMessageDialog(null, "Error. Please enter your values as positive whole dollar amounts. Items must be less than $1000.");
		}
	} 
} 
