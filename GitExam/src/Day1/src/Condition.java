import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요:");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요:");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("첫번째 숫자가 더 큽니다.");
		} else if (num1 == num2) {
			System.out.println("두 수가 같습니다");
		} else {
			System.out.println("두번째 숫자가 더 큽니다.");
		}
	}
}
