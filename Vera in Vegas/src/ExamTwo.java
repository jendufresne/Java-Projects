import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExamTwo{
	public static void main(String[] args) throws FileNotFoundException{
		int quarters = 100;
		
		File file = new File("src/out.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		
		int turn = 1;
		int totalSlotsPlayed = 0;
		int slot1Played = 0;
		int slot2Played = 0;
		int slot3Played = 0;
		
		
		while(quarters > 0){
			quarters = slot1(quarters, turn);
			slot1Played++;
			totalSlotsPlayed++;
			if(quarters > 0){
				quarters = slot2(quarters, turn);
				slot2Played++;
				totalSlotsPlayed++;
				if (quarters > 0){
					quarters = slot3(quarters, turn);
					turn++;
					slot3Played++;
					totalSlotsPlayed++;
				}
			}
			//System.out.println(quarters + " " + turn + " " + slotsPlayed);
		}
		if (quarters == 0){
			System.out.println("You are out of quarters.");
			System.out.println("You played slot 1 " + slot1Played + " times.");
			System.out.println("You played slot 2 " + slot2Played + " times.");
			System.out.println("You played slot 3 " + slot3Played + " times.");
			System.out.println("You played slots a total of " + totalSlotsPlayed + " times.");
		}
	}
	public static int slot1(int quarters, int turn){
		int win = turn % 33; // will win every 33rd time playing 
		quarters--; // remove one quarter for playing
		if(win == 0){
			quarters += 25;
			int winnings = 25;
			//add something that prints that you have won to text file.
			double dollars = dollars(winnings);
			double moneyLeft = dollars(quarters);
			System.out.println("You have won on slot machiene 1! You won $" + dollars + ". " + "There are " + quarters +" quarters left in the jar. You have $" + moneyLeft + " left in the jar.");
		}		
		return quarters;
	}
	
	public static int slot2(int quarters, int turn){
		int win = turn % 99; // will win every 99th turn
		quarters--; // remove one quarter for playing.
		if(win == 0){
			quarters += 75;
			int winnings = 75;
			double dollars = dollars(winnings);
			double moneyLeft = dollars(quarters);
			System.out.println("You have won on slot machiene 2! You won $" + dollars + ". " + "There are " + quarters +" quarters left in the jar. You have $" + moneyLeft + " left in the jar.");
		} 
		return quarters;
	}
	
	public static int slot3(int quarters, int turn){
		int win = turn % 9; // will win slot 3 every 9th time playing
		quarters--; // remove one quarter for playing
		if( win == 0){
			quarters += 7; 
			int winnings = 7;
			double dollars = dollars(winnings);
			double moneyLeft = dollars(quarters);
			System.out.println("You have won on slot machiene 3! You won $" + dollars + ". " + "There are " + quarters +" quarters left in the jar. You have $" + moneyLeft + " left in the jar.");
		}
		return quarters;
	}
	
	public static double dollars(int winnings){
		double dollars = winnings * 0.25;
		return dollars;
	}
}
