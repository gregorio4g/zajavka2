package test17;

public class test17 {
	public static void main(String[] args) {
		QuizCaller.call((int height) -> "Can hop with height: " + height);
		FishCaller.call(() -> 82);
	}
}
