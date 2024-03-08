import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// 345 봄 678 여름 9 10 11 가을 12 1 2 겨울
		
		System.out.print("해당 월을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch (month) {
		case 3: case 4: case 5: System.out.println("봄"); break;
		case 6: case 7: case 8: System.out.println("여름"); break;
		case 9: case 10: case 11: System.out.println("가을"); break;
		case 12: case 1: case 2: System.out.println("겨울"); break;
		}
	}
}
