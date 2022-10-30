package test19;

public class Cars5 {
	static class Car {
	}

	static class Cabriolet extends Car {
	}

	class SUV extends Car {
	}

	public static void main(String[] args) {
		Car car = new Cabriolet();
		Car nextCar = car;
		Cabriolet cabriolet = (Cabriolet) car;
		Car anotherCar = null;

		if (car instanceof Car) {
			System.out.println("one");
		}
		if (cabriolet instanceof Cabriolet) {
			System.out.println("two");
		}
		if (anotherCar instanceof SUV) {
			System.out.println("three");
		}
	}
}
