import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Beer {
	public static void main (String[] args)
	{
		double beersPerDay, pricePerBeer, beersPerYear, weightGain, avgCal, moneySpent;
		
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println("On average, how many 12 oz beers do you drink per day?");
		
		beersPerDay = scanner.nextDouble();
		
		if (beersPerDay < 0)
		{
			System.out.println("ERROR. Please make sure your input is a positive, real number. Please run program again.");
	
		} // end of beerPerDay < 0
		
		if(beersPerDay >= 0)
		{
			System.out.println("On average, how much do you spend on a 12oz beer?");
			
			pricePerBeer = scanner.nextDouble();
			
			if (pricePerBeer < 0)
			{
				System.out.println("ERROR. Please make sure your input is a positive, real number. Please run program again.");
			} // end pricePerBeer < 0
			
			if (pricePerBeer >= 0)
			{
			
			beersPerYear = beersPerDay * 365;
			
			avgCal = (beersPerDay * 150) * 365; // calories consumed from beer in one year
			
			weightGain = avgCal / 3500;  // general rule: 3500 cal = 1 lb weight gain
			
			moneySpent = (pricePerBeer * beersPerDay) * 365; // money spent on beer in a year
			
			System.out.println("If you consume " + beersPerDay + " beers per day, then you will have...");
			
			System.out.println("spent $" + df.format(moneySpent) + " on beer,");
			
			System.out.println("consumed " + df.format(beersPerYear) + " beers in one year,");
			
			System.out.println("and consumed an average of " + df.format(avgCal) + " calories from beer.");
			
			System.out.println("That will cause you to gain about " + df.format(weightGain) + " pounds if diet and excercise adjustments are not made.");
			} // end of pricePerBeer >= 0
		} // end of beersPerDay >= 0
	} // end of main
} // end of class
