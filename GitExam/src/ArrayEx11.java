import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				if (numArr[i] == j) {
					counter[numArr[i]] += 1;
				}
			}
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		}
	}
}
