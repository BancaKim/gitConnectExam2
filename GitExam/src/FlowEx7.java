import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// 가위(1), 바위(2),보(3)
		
		Scanner sc = new Scanner(System.in);
		int user = 0;
		do {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 선택하세요.:");
		user = sc.nextInt();
		} while (user!=1&&user!=2&&user!=3);
		int computer = (int)(Math.random()*3)+1;
		
		switch(user-computer) {
		case 2: case -1:
			System.out.println("당신이 졌습니다. 상대방:"+computer); break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다 상대방:"+computer); break;
		case 0:
			System.out.println("비겼습니다 상대방:"+computer); break;
		}
	}
}
