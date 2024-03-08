
public class ClassExam02 {

	// field
	private int a;

	// Constructor

	public ClassExam02() {
		System.out.println("디폴트생성자");
	}; // default 생성자 함수

	public ClassExam02(int a) {
		this.a = a;
	}

	// method : getter(외부에서 필드값을 얻어가는 함수), setter(외부에서 주는 데이터를 입력하는 함수)
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {

		ClassExam02 ce2 = new ClassExam02();

		ClassExam02 ce3 = new ClassExam02(10);

		ClassExam02 ce4 = new ClassExam02(500);

		ce2.setA(1000);  // ce2.a = 1000;

		System.out.println(ce2.getA()); //ce2.a
		System.out.println(ce3.getA()); //ce3.a
		System.out.println(ce4.getA()); //ce4.a

	}

}
