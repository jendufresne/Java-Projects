
public class Name {
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String suffix;
	
	
	public Name(String firstName, String middleInitial, String lastName, String suffix){
		setFirstName(firstName);
		setMiddleInitial(middleInitial);
		setLastName(lastName);
		setSuffix(suffix);
	}
	
	public Name(String firstName, String middleInitial, String lastName){
		setFirstName(firstName);
		setMiddleInitial(middleInitial);
		setLastName(lastName);
	}
	
	public Name(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setMiddleInitial(String middleInitial){
		this.middleInitial = middleInitial;
	}
	
	public String getMiddleInitial(){
		return middleInitial;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setSuffix(String suffix){
		this.suffix = suffix;
	}
	
	public String getSuffix(){
		return suffix;
	}
	
	public String toString(){
		String result;
		if(suffix != null){
			result = firstName + " " + middleInitial + " " + lastName + " " +suffix;
			
		}else if(suffix == null && middleInitial != null){
			result = firstName + " " + middleInitial + " " + lastName;
		}else{
			result = firstName + " " + lastName;
		}
		System.out.println(result);
		return result;
	}
}
