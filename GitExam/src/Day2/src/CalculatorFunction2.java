import java.util.Scanner;

public class CalculatorFunction2 {
	public static void main(String[] args) {

		String con;
		do {
			int num1 = CalculatorFunction2.inputNum1();
			String op = CalculatorFunction2.inputOp();
			int num2 = CalculatorFunction2.inputNum2();
			con = CalculatorFunction2.result(num1, op, num2);
		} while (con.equalsIgnoreCase("y"));
	}

	public static String result(int num1, String op, int num2) {
		if (op.equals("+")) {
			System.out.println(CalculatorFunction2.add(num1, num2));
		} else if (op.equals("-")) {
			System.out.println(CalculatorFunction2.minus(num1, num2));
		} else if (op.equals("*")) {
			System.out.println(CalculatorFunction2.multiply(num1, num2));
		} else if (op.equals("/")) {
			System.out.println(CalculatorFunction2.divide(num1, num2));
		} else {
			System.out.println("잘못된 입력");
		}
		System.out.print("계속하시겠습니까?(y/Y)>");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	public static int inputNum1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		return sc.nextInt();
	}
	public static int inputNum2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두번째 숫자를 입력하세요: ");
		return sc.nextInt();
	}
	public static String inputOp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 선택하세요.(+,-,*,/): ");
		return sc.next();
	}
	public static int add(int num1, int num2) {return num1 + num2;}
	public static int minus(int num1, int num2) {return num1 - num2;}
	public static int multiply(int num1, int num2) {return num1 * num2;}
	public static double divide(int num1, int num2) {return (double) num1 / num2;}
}