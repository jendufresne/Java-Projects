import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class LandEnclosure 
{
	public static void main(String[] args)
	{
		String input;
		
		input = JOptionPane.showInputDialog("What area do you need for your enclosure in square feet?");
		double area = Double.parseDouble(input);
		
		if (area >= 0)
		{
			input = JOptionPane.showInputDialog("What is the ratio of the length to the width of your enclosure?");
			
			String [] ratioInput = input.split(" ");
			
			double ratioLength = Double.parseDouble(ratioInput[0]);
			double rLMod = ratioLength % 1; //check if input is an integer
			
			if(ratioLength >= 0 && ratioLength<= 100 && rLMod == 0)
			{
				double ratioWidth = Double.parseDouble(ratioInput[1]);
				double rWMod = ratioWidth % 1; //check if input is an integer
				
				if(ratioWidth >= 0 && ratioWidth <= 100 && rWMod == 0)
				{
					DecimalFormat df = new DecimalFormat("#.##");
					df.setRoundingMode(RoundingMode.CEILING);
					
					double ratio = ratioLength / ratioWidth;
					
					double width = Math.sqrt(area / ratio);
					double length = ratio * width;
					
					double perimeter = (2 * length) + (2 * width);
					
					JOptionPane.showMessageDialog(null,
							"Your enclosure has dimensions " + df.format(length) + " feet by " + df.format(width)
									+ " feet. You will need " + df.format(perimeter) + " feet of fence total.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please enter your input as <integer> <integer>. Make sure your values are integers greater than 0 and less than 100.");
				} // end ratioWidth else
				
			} //end ratioLength if
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter your input as <integer> <integer>. Make sure your values are greater than 0 and less than 100.");
			} // end ratioLength else
			 
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please make sure your area is entered as a positive real number less than 1,000,000,000.");
		} // end area else
		
		
		
	} // end main
} // end class
