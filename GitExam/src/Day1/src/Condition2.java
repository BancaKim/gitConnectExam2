import java.util.Scanner;

public class Condition2 {
	public static void main(String[] args) {
		/*
		 * 사칙연산 계산기 (+,-,*,/)
		 * 
		 * 3+4
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("연산자를 선택하세요.(+,-,*,/): ");
		char op = sc.next().charAt(0);
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();

		if (op == '+') {
			System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 + num2));
		} else if (op == '-') {
			System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 - num2));
		} else if (op == '*') {
			System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 * num2));
		} else if (op == '/') {
			System.out.println(num1 + "" + op + "" + num2 + "=" + (num1 / (double) num2));
		} else {
			System.out.println("잘못된 입력");
		}
	}
}
