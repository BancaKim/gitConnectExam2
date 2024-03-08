import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[7];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println(Arrays.toString(lotto));

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 7);
			int temp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = temp;
		}
		for (int i : lotto) {
			System.out.print(i + " ");

		}

	}
}
