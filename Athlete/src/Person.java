
public class Person {

	private String firstName;
	private String lastName;
	private String name;
	private int age;
	
	public Person(String firstName, String lastName, int age){
		setName(firstName, lastName);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}
	
	public void doThis(){
		
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Person)){
			return false;
		}
		
		boolean result = false;
		
		if( ((Person) obj).getName() == this.getName()  && ((Person) obj).getAge() == this.getAge()){
			result = true;
		}
		
		return result;
	}
	
	public void setName(String firstName, String lastName){
		this.name = firstName + " " + lastName;
	}
	
	public void setName(String nickName){
		this.name = nickName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public String toString(){
		String result;
		result = "Name: " + name + " Age: " + age;
		return result;
	}
}
