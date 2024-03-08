
public class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = new String("Kim");
		names[1] = new String("Park");
		names[2] = new String("Yi");

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:" + names[i]);
		}

		String temp = "Yu";
		names[0] = temp;

		for (String name : names)
			System.out.println(name);
		
		System.out.println(names[1].substring(1,2));

	}
}
