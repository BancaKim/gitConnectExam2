
public class Condition_While {
	public static void main(String[] args) {

		int rect = 1;
		int count = 0;

		while (rect < 500) {
			rect *= 2;
			count++;
		}
		System.out.println(rect);
		System.out.println(count);
	}

}
