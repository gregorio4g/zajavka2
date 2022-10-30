package test19;

public class Animals4 {
	static class Animal {
		public void introduceYourself() {
			System.out.println("Hi I'm Animal");
		}
	}

	static class Cat extends Animal {
		@Override
		public void introduceYourself() {
			System.out.println("Hi I'm Cat");
		}
	}

	static class Dog extends Animal {
		@Override
		public void introduceYourself() {
			System.out.println("Hi I'm Dog");
		}
	}

	public static void main(String[] args) {
		Animal b = new Cat();
		Dog e = (Dog) b;
		e.introduceYourself();
	}
}
