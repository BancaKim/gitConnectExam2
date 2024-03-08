import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요.>");
		int input = sc.nextInt();
		
		if (input==0) {
			System.out.println("입력하신 숫자는 0입니다");
		} 
		
		if (input != 0) 
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 "+input+"입니다.");
	}
}
