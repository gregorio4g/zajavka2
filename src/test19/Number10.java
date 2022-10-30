package test19;

public class Number10 {

	int val = 1;

	static class BigNumber extends Number10 {
		int val = 2;
	}

	public static void main(String[] args) {
		Number10 number10 = new BigNumber();
		BigNumber bigNumber = new BigNumber();
		System.out.print(number10.val);
		System.out.print(bigNumber.val);
	}
}
