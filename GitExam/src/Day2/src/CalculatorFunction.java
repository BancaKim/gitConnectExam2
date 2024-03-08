import java.util.Scanner;

public class CalculatorFunction {
	public static void main(String[] args) {

		String con;
		Scanner sc = new Scanner(System.in);
		do {
			int num1 = CalculatorFunction.inputNum1(sc);
			String op = CalculatorFunction.inputOp(sc);
			int num2 = CalculatorFunction.inputNum2(sc);
			con = CalculatorFunction.result(num1, op, num2, sc);
		} while (con.equalsIgnoreCase("y"));
	}

	public static String result(int num1, String op, int num2, Scanner sc) {
		if (op.equals("+")) {
			System.out.println(CalculatorFunction.add(num1, num2));
		} else if (op.equals("-")) {
			System.out.println(CalculatorFunction.minus(num1, num2));
		} else if (op.equals("*")) {
			System.out.println(CalculatorFunction.multiply(num1, num2));
		} else if (op.equals("/")) {
			System.out.println(CalculatorFunction.divide(num1, num2));
		} else {
			System.out.println("잘못된 입력");
		}
		System.out.print("계속하시겠습니까?(y/Y)>");
		return sc.next();
	}

	public static int inputNum1(Scanner sc) {
		System.out.print("첫번째 숫자를 입력하세요: ");
		return sc.nextInt();
	}

	public static int inputNum2(Scanner sc) {
		System.out.print("두번째 숫자를 입력하세요: ");
		return sc.nextInt();
	}

	public static String inputOp(Scanner sc) {
		System.out.print("연산자를 선택하세요.(+,-,*,/): ");
		return sc.next();
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}
}