
public class ArrayEx5 {
	public static void main(String[] args) {

		int sum = 0;
		float average = 0f;
		
		int[] score = new int[] {100,88,100,100,90};
		
		for(int i=0; i<score.length;i++) {
			sum += score[i];
		}
		average = (float)sum/score.length;
		
		System.out.println(sum);
		System.out.println(average);
	}
}
