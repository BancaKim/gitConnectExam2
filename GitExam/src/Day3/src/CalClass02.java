import java.util.Scanner;

public class CalClass02 {
	private int num1, num2;
	private char ch;
	private char ans;
	private double result;

	public CalClass02() {
	};

	public CalClass02(int num1, char ch, int num2, char ans, double result) {
		this.num1 = num1;
		this.ch = ch;
		this.num2 = num2;
		this.ans = ans;
		this.result = result;
	};

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public char getAns() {
		return ans;
	}

	public void setAns(char ans) {
		this.ans = ans;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("사칙연산 기호 : ");
		char ch = sc.next().charAt(0);
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		CalClass02 calc = new CalClass02(num1, ch, num2, 'y', 0);

		// 연산함수 호출
		while (calc.getAns() == 'y' || calc.getAns() == 'Y') {
			switch (calc.getCh()) {
			case '+':
				calc.setResult(calc.add(calc.getNum1(), calc.getNum2()));
				break;
			case '-':
				calc.setResult(calc.sub(calc.getNum1(), calc.getNum2()));
				break;
			case '*':
				calc.setResult(calc.mul(calc.getNum1(), calc.getNum2()));
				break;
			case '/':
				calc.setResult(calc.div(calc.getNum1(), calc.getNum2()));
				break;
			}
			// 출력함수 호출
			calc.disp(calc.getNum1(), calc.getCh(), calc.getNum2(), calc.getResult());
			System.out.print("계속하시겠습니까?(y/Y)>");
			calc.setAns(sc.next().charAt(0));
		}
	}

	public void disp(int num1, char ch, int num2, double result) {
		System.out.println(num1 + "" + ch + "" + num2 + "=" + result);
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public double div(int num1, int num2) {
		return (double) num1 / num2;
	}
}
