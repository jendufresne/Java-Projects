
public class Cat extends Animal {

	private String name;
	private int lives = 9;

	public Cat(String name, int lives, int weight, int height) {
		super(weight, height);
		setName(name);
		setLives(lives);
	}

	public Cat(int weight, int height, String name) {
		super(weight, height);
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLives(int lives) {
		if (lives > 0 && lives < 9) {
			this.lives = lives;
		} else {
			System.out.println("Cats can only have 9 lives! Please enter a number between 1 and 9");
		}
	}

	public int getLives() {
		return lives;
	}

	public void dies() {
		if (lives > 1) {
			lives--;
			System.out.println(this.name + " has " + this.lives + " lives left.");
		} else if (lives == 1) {
			lives--;
			System.out.println("The cat has run out of lives");
		} else {
			System.out.println("The cat doesn't have any lives left");
		}
	}

	public String toString() {
		String result;
		result = "Cat: " + name + " has " + lives + " lives." + super.toString();
		return result;
	}
}
