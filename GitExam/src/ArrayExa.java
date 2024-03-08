import java.util.Arrays;

public class ArrayExa {
	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };

		System.out.println(Arrays.toString(score));

		System.out.println(score.length);
		System.out.println(score[0].length);

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = 10;
				System.out.println("score" + "[" + i + "]" + "[" + j + "]=" + score[i][j]);
			}
		}
		int sum=0;
		for (int[] tmp : score) {
			for(int num:tmp) {
				sum += num;
			}
		}
		System.out.println(sum);
		
	}
}
