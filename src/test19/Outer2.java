package test19;

public class Outer2 {
	private int a = 1;
	private int b = 2;

	public static void main(String[] args) {
		new Outer2().call();
	}

	private void call() {
		class Inner	{

			private int b = Outer2.this.a;

			public void print() {
				System.out.println(this.b);
			}
		}
		Inner inner= new Inner();
		inner.print();
	}
}
