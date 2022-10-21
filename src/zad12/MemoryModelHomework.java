package zad12;

public class MemoryModelHomework {
	public static void main(String[] args) {
		MemoryModelHomework homework = new MemoryModelHomework();
		homework.run();
	}

	private void run() {
		String variable1 = "zaJavke";
		Dog dog = new Dog("Romek");
		dog.setName("RAfał");
		method(variable1, dog);
		System.out.println(dog.getName());
		variable1 = "Rafał";
	}

	private void method(String variable1, Dog dog) {
		variable1.toUpperCase();
		dog.setName("Tomek");
		variable1 = dog.getName();
		System.out.println(variable1);
		System.out.println(dog.getName());
	}
}
