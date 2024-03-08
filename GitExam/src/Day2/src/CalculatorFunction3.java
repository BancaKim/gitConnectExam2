import java.util.Scanner;

public class CalculatorFunction3 {
	public static void main(String[] args) {
		int num1, num2;
		char ch;
		char ans = 'n';
		double result = 0;
		Scanner sc = new Scanner(System.in);

		do {
			// 입력함수 호출
			num1 = CalculatorFunction3.inputInt(sc);
			ch = CalculatorFunction3.inputChar(sc);
			num2 = CalculatorFunction3.inputInt(sc);

			// 연산함수 호출
			switch (ch) {
			case '+':
				result = CalculatorFunction3.add(num1, num2);
				break;
			case '-':
				result = CalculatorFunction3.sub(num1, num2);
				break;
			case '*':
				result = CalculatorFunction3.mul(num1, num2);
				break;
			case '/':
				result = CalculatorFunction3.div(num1, num2);
				break;
			}
			// 출력함수 호출
			CalculatorFunction3.disp(num1, ch, num2, result);
			System.out.print("계속하시겠습니까?(y/Y)>");
			ans = CalculatorFunction3.inputChar(sc);
		} while (ans == 'y' || ans == 'Y');
	}

	public static void disp(int num1, char ch, int num2, double result) {
		System.out.println(num1 + "" + ch + "" + num2 + "=" + result);
	}

	public static char inputChar(Scanner sc) {
		char ch = sc.next().charAt(0);
		return ch;
	}

	public static int inputInt(Scanner sc) {
		int num = sc.nextInt();
		return num;
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static double div(int num1, int num2) {
		return (double) num1 / num2;
	}

}
