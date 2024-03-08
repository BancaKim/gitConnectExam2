
public class Condition_While2 {
	public static void main(String[] args) {

		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
