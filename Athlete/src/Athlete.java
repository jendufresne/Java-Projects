
abstract public class Athlete extends Person implements Score{

	private String team;
	private String position;

	public Athlete(String team, String position, String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		setTeam(team);
		setPosition(position);
	}
	
	abstract public void doThis();
	
	public void score(){
		System.out.println("I scored");
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof BaseballPlayer)){
			return false;
		}
		
		boolean result = false;
		
		if(((Athlete) obj).getTeam() == this.getTeam() && ((Athlete) obj).getPosition() == this.getPosition() && ((Athlete) obj).getName() == this.getName() && ((Athlete) obj).getAge() == this.getAge() ){
			result = true;
		}
		
		return result;
	}
	

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setPosition(String positionOne, String positionTwo){
		this.position = positionOne + " " + positionTwo;
	}

	public String getPosition() {
		return position;
	}

	public String toString() {
		String result;
		result = super.toString() + " Team: " + team + " Position: " + position;
		return result;
	}
}
