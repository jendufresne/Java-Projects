
public class HockeyPlayer extends Athlete{

	private String stickBrand;
	
	public HockeyPlayer(String stickBrand, String firstName, String lastName, int age, String team, String position){
		super(team, position, firstName, lastName, age);
		setStickBrand(stickBrand);
	}
	
	public void score(){
		System.out.println("Goal");
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof HockeyPlayer)){
			return false;
		}
		
		boolean result = false;
		
		if(((HockeyPlayer) obj).getStickBrand() == this.getStickBrand() && ((Athlete) obj).getTeam() == this.getTeam() && ((Athlete) obj).getPosition() == this.getPosition() && ((Athlete) obj).getName() == this.getName() && ((Athlete) obj).getAge() == this.getAge() ){
			result = true;
		}
		
		return result;
	}
	
	public void injury(int injuryNum){
		System.out.println(this.getName() + " has " + injuryNum + " injuries");
	}
	
	public void injury(String injuryType){
		System.out.println(this.getName() + "has a " + injuryType);
	}
	
	public void setStickBrand(String stickBrand){
		this.stickBrand = stickBrand;
	}
	
	public String getStickBrand(){
		return stickBrand;
	}
	
	public void doThis(){
		System.out.println("I sit in a penalty box");
	}
	
	public String toString(){
		String result;
		result = "Hockey Player- " + super.toString() + " Stick Brand: " + stickBrand;
		return result;
	}
}
