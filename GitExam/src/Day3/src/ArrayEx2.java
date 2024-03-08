import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = { 50, 60, 70, 80, 90 };
		char[] cArr = { 'a', 'b', 'c', 'd' };
		
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i] = i+1;
		}
		
		for(int i=0;i<iArr2.length;i++) {
			iArr2[i] = (int)Math.random()*10+1;
		}
		for(int i:iArr1) {
			System.out.print(i+",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(cArr);
		
		int[] arr = new int[] {3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int[] tmp = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			tmp[i]=arr[i];
		}
		arr = tmp;
		System.out.println(Arrays.toString(arr));
	}
}
