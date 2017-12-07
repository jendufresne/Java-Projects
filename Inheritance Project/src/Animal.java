
public class Animal {

	private int weight;
	private int height;

	public Animal(int weight, int height) {
		setWeight(weight);
		setHeight(height);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String toString() {
		String result;
		result = " I'm an animal weighing: " + weight + " lbs with a height of " + height + " inches.";
		return result;
	}
}
