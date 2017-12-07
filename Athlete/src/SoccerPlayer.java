
public class SoccerPlayer extends Athlete{

	int yellowCard;
	int numYellow;
	int redCard;
	boolean suspended;
	
	public SoccerPlayer(String firstName, String lastName, int age, String team, String position, boolean suspended){
		super(team, position, firstName, lastName, age);
	}
	
	public void score(){
		System.out.println("GOOOAAAALLLL");
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof SoccerPlayer)){
			return false;
		}
		
		boolean result = false;
		
		if(((SoccerPlayer) obj).getSuspended() == this.getSuspended() && ((Athlete) obj).getTeam() == this.getTeam() && ((Athlete) obj).getPosition() == this.getPosition() && ((Athlete) obj).getName() == this.getName() && ((Athlete) obj).getAge() == this.getAge() ){
			result = true;
		}
		
		return result;
	}
	
	
	public void setSuspended(boolean suspended){
		this.suspended = suspended;
	}
	
	public boolean getSuspended(){
		return suspended;
	}
	
	public void giveYellow(){
		yellowCard++;
		numYellow = yellowCard % 2;
		if(numYellow == 0){
			redCard ++;
			suspended = true;
		}
	}
	
	public void giveRed(){
		redCard++;
	}
	
	public void doThis(){
		System.out.println("I kick something");
	}
	
	
	public String toString(){
		String result;
		result = "Soccer Player- " + super.toString() + " Yellow Cards: " + yellowCard + " Red Cards: " + redCard + " Suspended? " + suspended;
		return result;
	}
}
