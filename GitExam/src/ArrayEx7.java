import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] iArr = new int[10];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(iArr));

		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 10);
			int temp = iArr[0];
			iArr[0] = iArr[i];
			iArr[i] = temp;
		}
		System.out.println(Arrays.toString(iArr));

		for (int i : iArr) {
			System.out.print(i+" ");
		}

	}

}
