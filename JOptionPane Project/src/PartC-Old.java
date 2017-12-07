//import javax.swing.JOptionPane;
//
//public class PartC {
//	public static void bestDeal() {
//		String input;
//		input = JOptionPane.showInputDialog("How much money is left on the card in dollars)?");
//		int cardAmount = Integer.parseInt(input);
//		if(cardAmount > 0 && cardAmount < 1000)
//		{
//			input = JOptionPane.showInputDialog("What is the cost in dollars of the three items you may buy?");
//			String[] itemsPrices = input.split(" ");
//
//			int itemA = Integer.parseInt(itemsPrices[0]);
//			int itemB = Integer.parseInt(itemsPrices[1]);
//			int itemC = Integer.parseInt(itemsPrices[2]);
//			
//			int leftOver = cardAmount;
//
//			if (itemA > 0 && itemA < 1000 && itemB > 0 && itemB < 1000 && itemC > 0 && itemC < 1000) {
//				if (leftOverA == 0 || leftOverB == 0 || leftOverC == 0) {
//					JOptionPane.showMessageDialog(null,
//							"The least amount of money you can leave on your card is $0"); // all values will be zero
//																									
//				} else if (leftOverA > 0) { // check if user can purchase item A
//					int itemsAB = itemA + itemB;
//					int itemsAC = itemA + itemC;
//					int itemsBC = itemB + itemC; 
//					int itemsABC = itemA + itemB + itemC;
//					
//					int leftOverAB = cardAmount -itemsAB;
//					int leftOverAC = cardAmount - itemsAC; 
//					int leftOverBC = cardAmount - itemsBC;
//					int leftOverABC = cardAmount - itemsABC;
//					
//					if (leftOverABC >= 0) {
//						JOptionPane.showMessageDialog(null,
//								"The least amount of money you can leave on your card is $" + itemsABC);
//						
//					} else if (leftOverAB >= 0 ) {
//						if(leftOverAC >= 0){
//							if(leftOverAB <= leftOverAC )
//							{
//								JOptionPane.showMessageDialog(null,
//										"The least amount of money you can leave on your card is $" + leftOverAB);
//							}
//						}else if (leftOverBC >= 0){
//							if(leftOverAB <= leftOverBC )
//							{
//								JOptionPane.showMessageDialog(null,
//										"The least amount of money you can leave on your card is $" + leftOverAB);
//							}
//						}else{
//							JOptionPane.showMessageDialog(null,
//									"The least amount of money you can leave on your card is $" + leftOverAB);
//						}
//					} else if (leftOverAC >= 0){
//						if(leftOverBC >= 0){
//							if(leftOverAC <= leftOverBC) {
//								JOptionPane.showMessageDialog(null,
//										"The least amount of money you can leave on your card is $" + leftOverAC);
//							}
//						}	
//
//					} else if (leftOverBC >= 0 && leftOverBC <= leftOverA){
//						JOptionPane.showMessageDialog(null,
//								"The least amount of money you can leave on your card is $" + leftOverBC);
//					}
//					else {
//						JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + leftOverA);
//					}
//
//
//				} else if (leftOverB > 0) { // check if user can purchase item B, given not being able to buy item A
//					int itemBC = itemB + itemC;
//					int leftOverBC = cardAmount - itemBC;
//					
//					if(leftOverBC >= 0){
//						JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + leftOverBC);
//					}
//					if(leftOverC >= 0)
//					{
//						if(leftOverB < leftOverC){
//							JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + leftOverB);
//						}
//					}else{
//						JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + leftOverC);
//					}
//				} else if (leftOverC > 0){ // check if user can purchase item C, given not being able to buy item A or B
//					JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + leftOverC);
//					// only item C here
//				} else if (leftOverA < 0 && leftOverB < 0 && leftOverC < 0) { //user cannouy buy anything
//					JOptionPane.showMessageDialog(null,
//							" The least amount of money you can leave on your card is $" + cardAmount);
//				}
//			} else {
//				JOptionPane.showMessageDialog(null,
//						"Error. Please enter your values as positive whole dollar amounts. Items must be less than $1000.");
//			}
//		} else if (cardAmount == 0) {
//			JOptionPane.showMessageDialog(null, "You do not have any money on your card");
//		} else {
//			JOptionPane.showMessageDialog(null,
//					"Error. Please enter your values as positive whole dollar amounts. Items must be less than $1000.");
//		}
//	}
//}
