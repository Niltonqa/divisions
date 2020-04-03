package DivE;

public class Division {

	private int num1;
	private int num2;
	private int divideSum;

	public Division(int first, int second) {
		this.num1 = first;
		this.num2 = second;
	}

	public int divideNumbers() {
		try {
			this.divideSum = this.num1 / this.num2;
		}

		catch (ArithmeticException ae) {
			System.out.println("wrong number hoe");
		}

		return divideSum;
	}

}
