package test19;

public class Outer1 {
	private int a = 1;

	static class Inner {

		public static int a = 2;

		public void call() {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		Inner inner = new Inner();
		inner.call();
	}
}
