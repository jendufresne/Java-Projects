
public class Dog extends Animal {

	private String name;
	private String breed;
	private String dob;

	public Dog(String name, String breed, String dob, int weight, int height) {
		super(weight, height);
		setName(name);
		setBreed(breed);
		setDOB(dob);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setDOB(String dob) {
		this.dob = dob;
	}

	public String getDOB() {
		return dob;
	}

	public String toString() {
		String result;
		result = "Dog: " + name + " is a " + breed + " born on " + dob + super.toString();
		return result;
	}
}
