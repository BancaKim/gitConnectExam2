import java.util.Scanner;

public class Ex6_1 {

	public static void main(String[] args) {
		System.out.print("홀수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
        for (int i = 1; i <= num/2+1; i++) {
            for (int j = num/2+1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = num/2+1; j >= i; j--) { 
                System.out.print(" ");
            }
            System.out.println();
        }
        /// 역방향
        
        for (int i = 1; i <= num/2  ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= num-2*i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) { 
                System.out.print(" ");
            }
            System.out.println();
        }
    }		
}
