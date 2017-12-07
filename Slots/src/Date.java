
public class Date {

	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year){
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public void setMonth(int month){
		if(month > 0 && month < 13){
			this.month = month;
		} 
		else{
			System.out.println("Please enter a value between 1 and 12 for month");
		}
		
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setDay(int day){
		if(day > 0 && day < 32){
			this.day = day;
		}
		else{
			System.out.println("Please enter a value between 1 and 31 for day.");
		}
	}
	
	public int getDay(){
		return day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	public String toString(){
		String result;
		result = month + "/" + day + "/" + year;
		System.out.println(result);
		return result;
	}

}
