import java.util.Scanner;

public class CalEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 6까지 숫자를 입력해주세요>");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			CalEx1.makeSquare();
			break;
		case 2:
			CalEx1.makeTriangle();
			break;
		case 3:
			CalEx1.makeReverseTriangle();
			break;
		case 4:
			CalEx1.makeTree();
			break;
		case 5:
			CalEx1.makeRhomb();
			break;
		case 6:
			CalEx1.makeSelfRhomb(sc);
		}
	}

	public static void makeSquare() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void makeTriangle() {
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void makeReverseTriangle() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void makeTree() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void makeRhomb() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/// 역방향
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void makeSelfRhomb(Scanner sc) {
		System.out.print("홀수를 입력하세요:");
		int num = sc.nextInt();

		for (int i = 1; i <= num / 2 + 1; i++) {
			for (int j = num / 2 + 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/// 역방향

		for (int i = 1; i <= num / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= num - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
