
public class BaseballPlayer extends Athlete{

	private int battingPosition;
	private String handedness = "Not indicated";
	private String status;
	
	public BaseballPlayer(int battingPosition, String handedness, String firstName, String lastName, int age, String team, String position){
		super(team, position, firstName, lastName, age);
		setBattingPosition(battingPosition);
		setHandedness(handedness);
	}
	
	public void score(){
		System.out.println("Homerun!");
	}
	public boolean equals(Object obj){
		if(!(obj instanceof BaseballPlayer)){
			return false;
		}
		
		boolean result = false;
		
		if(((BaseballPlayer) obj).getBattingPosition() == this.getBattingPosition() && ((BaseballPlayer) obj).getHandedness() == this.getHandedness() && ((Athlete) obj).getTeam() == this.getTeam() && ((Athlete) obj).getPosition() == this.getPosition() && ((Athlete) obj).getName() == this.getName() && ((Athlete) obj).getAge() == this.getAge()  ){
			result = true;
		}
		
		return result;
	}
	
	public void setStatus(boolean playing){
		if(playing == true){
			System.out.println(this.getName() +" is playing.");
		}else{
			System.out.println(this.getName() + " is not playing.");
		}
	}
	
	public void setStatus(boolean playing, boolean watching){
		if(playing == true && watching == true){
			System.out.println(this.getName() + " is playing and watching the game.");
		}else if(playing != true && watching == true){
			System.out.println(this.getName() + " is not playing but is watching the game.");
		} else if(playing == true && watching != true){
			System.out.println(this.getName() + " is playing but is not watching the game.");
		} else{
			System.out.println(this.getName() + " is not playing and not watching the game.");
		}
	}
	
	public String getStatus(){
		return status;
	}
	public void setBattingPosition(int battingPosition){
		this.battingPosition = battingPosition;
	}
	
	public int getBattingPosition(){
		return battingPosition;
	}
	
	public void setHandedness(String handedness){
		if(handedness.equals("right") || handedness.equals("Right") || handedness.equals("righthanded") || handedness.equals("Righthanded")){
			this.handedness = "Righthanded";
		}else if(handedness.equals("left") || handedness.equals("Left") || handedness.equals("lefthanded") || handedness.equals("Lefthanded")){
			this.handedness = "Lefthanded";
		} else if(handedness.equals("both") || handedness.equals("Both")){
			this.handedness = "Both";
		} else{
			System.out.println("Please indicate if the player is right handed, left handed, or both.");
		}
	}
	
	public String getHandedness(){
		return handedness;
	}
	
	public void doThis(){
		System.out.println("I hit something");
	}
	
	public String toString(){
		String result;
		result = "Baseball Player- " + super.toString() + " Batting Position: " + battingPosition + " Handedness: " + handedness;
		return result;
	}
}
