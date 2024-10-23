package abhishek;

class Calculation {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}
}

class AdvanceCalculation {
	private void add(int a, int b) {
		System.out.println(2.71 * (a + b));
	}
}

public class Calculator {
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.add(34, 8);
	}
}