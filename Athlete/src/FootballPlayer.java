
public class FootballPlayer extends Athlete{

	private String speciality;
	
	public FootballPlayer(String speciality, String firstName, String lastName, int age, String team, String position){
		super(team, position, firstName, lastName, age);
		setSpeciality(speciality);
	}
	
	public void score(){
		System.out.println("Touchdown!");
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof FootballPlayer)){
			return false;
		}
		
		boolean result = false;
		
		if(((FootballPlayer) obj).getSpeciality() == this.getSpeciality() && ((Athlete) obj).getTeam() == this.getTeam() && ((Athlete) obj).getPosition() == this.getPosition() && ((Athlete) obj).getName() == this.getName() && ((Athlete) obj).getAge() == this.getAge() ){
			result = true;
		}
		
		return result;
	}
	
	
	
	public void injuryStatus(boolean injury){
		if(injury == true){
			System.out.println(this.getFirstName() + " is injured");
		} else{
			System.out.println(this.getFirstName() + " is not injured");
		}
	}
	
	public void injuryStatus(boolean injury, boolean playing){
		if(injury == true && playing == true){
			System.out.println(this.getFirstName() + " is playing with an injury");
		} else if(injury != true && playing == true){
			System.out.println(this.getFirstName() + " doesn't have an injury and is playing");
		} else if(injury == false && playing == false){
			System.out.println(this.getFirstName() + " is on the bench without and injury");
		} else{
			System.out.println(this.getFirstName() + " is on the bench with an injury");
		}
	}
	
	public void setSpeciality(String speciality){
		if(speciality.equals("Offense") || speciality.equals("offense")){
			this.speciality = "Offense";
		}else if(speciality.equals("Defense") || speciality.equals("defense")){
			this.speciality = "Defense";
		}else if(speciality.equals("Special") || speciality.equals("special") || speciality.equals("Special Teams") || speciality.equals("special teams")){
			this.speciality = "Special Teams";
		}else{
			System.out.println("Please indicate if speciality is offense, defense, or special teams.");
		}
	}
	
	public String getSpeciality(){
		return speciality;
	}
	
	public void doThis(){
		System.out.println("I tackle something");
	}
	
	public String toString(){
		String result;
		result = "Football Player- " + super.toString() + " Speciality: " + speciality;
		return result;
	}
}
