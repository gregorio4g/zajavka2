package test17;

public class Climber {
	public static void main(String[] args) {
		test((a, l) -> a >= l);
	}

	private static void test(EntranceLimit entranceLimit) {
		System.out.println(entranceLimit.test(11,10) ? "Get in" : "You're too young");
	}
}
