
public class Ex5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 3; j >= i; j--) { 
                System.out.print(" ");
            }
            System.out.println();
        }
        /// 역방향
        
        for (int i = 1; i <= 2  ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= 5-2*i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) { 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}