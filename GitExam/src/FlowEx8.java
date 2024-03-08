import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
		
		Scanner sc = new Scanner(System.in);
		String ref = sc.next();
		
		char gender = ref.charAt(7);
		switch (gender) {
		case '1': case '3': System.out.println("성별이 남자입니다."); break;
		case '2': case '4': System.out.println("성별이 여자입니다."); break;
		default: System.out.println("유효하지 않은 주민번호입니다.");
		}
		
	}
}
