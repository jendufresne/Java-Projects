
public class TestInheritance {

	public static void main(String[] args) {
		Animal myPet = new Animal(36, 12);
		System.out.println(myPet);

		Dog sam = new Dog("Samantha", "corgi", "01/01/2005", 35, 24);
		System.out.println(sam);

		Cat patches = new Cat("Patches", 2, 15, 12);
		patches.dies();
		patches.dies();
		System.out.println(patches);

		Bird danny = new Bird(30, true, 5, 15);
		System.out.println(danny);

	}

}
