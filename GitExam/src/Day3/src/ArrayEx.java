import java.util.Arrays;

public class ArrayEx {
public static void main(String[] args) {
	int[] score = new int[5];
	score = new int[] {1,2,3,4,5};
	
	for(int num : score) {
		System.out.println(num);
	}
	
	System.out.println(Arrays.toString(score));
	
	char[] chArr = {'1','2','3','4','5'};
	System.out.println(chArr);
}
}
