
public class Ex_Condition {

	public static void main(String[] args) {

		int rect = 1;
		int count = 0;

		for (count = 0; rect < 500; count++) {
			rect *= 2;
		}
		System.out.println(rect);
		System.out.println(count);
	}

}
