
public class Golfer extends Athlete{

	private String mainSponser;
	
	public Golfer(String mainSponser, String firstName, String lastName, int age, String team, String position){
		super(team, position, firstName, lastName, age);
		setMainSponser(mainSponser);
	}
	
	public void score(){
		System.out.println("Hole in one");
	}
	
	
	public boolean equals(Object obj){
		if(!(obj instanceof Golfer)){
			return false;
		}
		
		boolean result = false;
		
		if(((Golfer) obj).getMainSponser() == this.getMainSponser() && ((Athlete) obj).getTeam() == this.getTeam() && ((Athlete) obj).getPosition() == this.getPosition() && ((Athlete) obj).getName() == this.getName() && ((Athlete) obj).getAge() == this.getAge() ){
			result = true;
		}
		
		return result;
	}
	
	
	
	public void winning(boolean winning, int score){
		if(winning == true){
			System.out.println(this.getFirstName() + " is winning with a score of " + score);
		}else{
			System.out.println(this.getFirstName() + " is not winning with a score of " + score);
		}
	}
	
	public void winning(boolean winning, boolean holeInOne){
		if(winning == true && holeInOne == true){
			System.out.println(this.getFirstName() + " is winning and have score a hole in one!");
		} else if(winning == true  && holeInOne != true){
			System.out.println(this.getFirstName() + " is winning but hasn't score a hole in one.");
		} else if (winning != true && holeInOne == true){
			System.out.println(this.getFirstName() + " is not winning but has score a hole in one.");
		} else{
			System.out.println(this.getFirstName() + " is not winning and has not scored a hole in one.");
		}
	}
	
	public void setMainSponser(String mainSponser){
		this.mainSponser = mainSponser;
	}
	
	public String getMainSponser(){
		return mainSponser;
	}
	
	public void doThis(){
		System.out.println("I putt it in the hole");
	}
	
	public String toString(){
		String result;
		result = "Golfer- " + super.toString() + " Main Sponser: " + mainSponser;
		return result;
	}
}
