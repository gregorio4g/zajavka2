public class Square {
	private final int a;

	public Square(int a) {
		this.a = Math.max(a, 1);
	}

	public Square() {
		this(1);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Square square)) return false;

		return getA() == square.getA();
	}

	@Override
	public int hashCode() {
		return getA();
	}

	public int getA() {
		return a;
	}

	public long perimeter() {
		return 4 * (long) a;
	}

	public long area() {
		return (long) a * a;
	}

	@Override
	public String toString() {
		return "Square{" +
				"a=" + a +
				'}';
	}
}
