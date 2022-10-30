package test19;

public class OuterClass7 {
	class InnerClass {
	}

	public static void main(String[] args) {
		OuterClass7.InnerClass in = new OuterClass7().new InnerClass();
	}
}
