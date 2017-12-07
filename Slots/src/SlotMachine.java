import javax.swing.JOptionPane;

public class SlotMachine {
	private String machineName;
	private int balance;
	private int jpWins;
	private double jpOdds;
	private int jpPay;
	private int jpNum; // number of times machine is played until jackpot win
	private int regWins;
	private double regOdds;
	private int regPay;
	private int regNum; // number of times machine is played until regular win
	public int timesPlayed = 0;
	
	public SlotMachine(String machineName, int balance, double jpOdds, int jpPay, int jpNum, double regOdds, int regPay, int regNum){
		setName(machineName);
		setBalance(balance);
		setJpOdds(jpOdds);
		setJpPay(jpPay);
		setRegOdds(regOdds);
		setRegPay(regPay);
		setJpNum(jpNum);
		setRegNum(regNum);
	}
	
	public void setName(String machineName){
		this.machineName = machineName;
	}
	
	public String getName(){
		return machineName;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public int getNumJpPaid(){
		return jpWins;
	}
	
	public void setJpOdds(double jpOdds){
		if(jpOdds >= 0 && jpOdds < 1){
			this.jpOdds = jpOdds;
		}else{
			System.out.println("Please enter a value between 0 and 1. To represent odds.");
		}
	}
	
	public double getJpOdds(){
		return jpOdds;
	}
	
	public void setJpPay(int jpPay){
		this.jpPay = jpPay;
	}
	
	public int getJpPay(){
		return jpPay;
	}
	
	public int getRegWins(){
		return regWins;
	}
	
	public void setRegOdds(double regOdds){
		if(regOdds >= 0 && regOdds < 1){
			this.regOdds = regOdds;
		}else{
			System.out.println("Please enter a value between 0 and 1. To represent odds.");
		}
	}
	
	public double getRegWinOdds(){
		return regOdds;
	}
	
	public void setRegPay(int regPay){
		this.regPay = regPay;
	}
	
	public int getRegPay(){
		return regPay;
	}
	
	public int getTimesPlayed(){
		return timesPlayed;
	}
	
	public void machinePlayed(){
		this.timesPlayed ++;
		this.balance ++;
	}
	
	public void setJpNum(int jpNum){
		this.jpNum = jpNum;
	}
	
	public int getJpNum(){
		return jpNum;
	}
	
	public void setRegNum(int regNum){
		this.regNum = regNum;
	}
	
	public int getRegNum(){
		return regNum;
	}
	
	public boolean checkJpWin(){
		int jpWinCheck = timesPlayed % jpNum;
		
		if(jpWinCheck == 0){
			JOptionPane.showMessageDialog(null, "JACKPOT! You have won $" + jpPay);
			balance =- jpPay;
			return true;
			
		}else{
			return false;
		}
	}
	
	public boolean checkRegWin(){
		int regWinCheck = timesPlayed % regNum;
		
		if(regWinCheck == 0){
			JOptionPane.showMessageDialog(null, "You have won $" + regPay);
			this.balance = balance - regPay;
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		String result;
		result = "The slot machine's name is " + machineName + " the balance is " + balance + " the number of jackpots paid is " + jpWins + " the jackpot odds are " + jpOdds + " and the jackpot pay is $" + jpPay + ". The number of regular wins is " + regWins + " the pay is $" + regPay + " and the odds are " + regOdds;
		return result;
	}
}
