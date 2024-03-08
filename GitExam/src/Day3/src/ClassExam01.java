/*
 *  구성요소
 *  1.Field : 
 *  - 객체가 생성된 후 지속적으로 사용되어지는 변수 Data - 객체가 생성될 때 만들어져서 객체가 사라질때 같이 사라진다 <-> local variable : 메서드 시작과 끝 
 *  - 접근지정자 주로 private. (Encapsulation)
 *  - static, final(읽기전용) 사용 가능 final은 static과 자주 같이 쓰인다
 *  - instance field, static field
 *  
 *  2.Constructor(생성자) : 
 *  - 객체 생성 시 자동호출 되어지는 함수(딱 1번)
 *  - 생성자함수를 명시적으로 제공하지 않을 경우 디폴트 생성자를 제공
 *  - 리턴타입이 존재하지 않고, 함수명은 클래스명과 동일
 *  - 기능
 *    1) 디폴트기능 : 객체등록
 *    2) 사용자기능 : 객체 생성시 필드 초기화 (heap에 생성되기 때문에 초기화 값이 0으로 되어있음) 
 *  - 오버로딩이 가능.
 *  - 접근지정자를 주로 public으로 지정.  
 *  //private으로 생성자를 만들어두고, 그 클래스 안에 다른 메서드에서 생성자로 객체 생성해서 그 메서드를 이용하는 방법 - Singleton Design Pattern
 *  - default 생성자를 명시적으로 만들 경우 숨어있는 디폴트를 제공하지 않음.
 *  - 명시적으로 생성자를 하나 이상 만들 경우, 디폴트는 제공하지 않는다.
 * 
 *  3.Method(instance/static) :
 *  - 외부에서 내부의 필드를 접근해서 사용할 수 있게 하기 위해
 *  - 접근지정자 주로 public 지정
 *  - instance method, static method => this 여부 
 *  - 오버로딩이 가능하다
 *  
 *  ※ 오버로딩
 *  - 동일한 함수명으로 여러개의 함수를 만들어서 제공.
 *  - 같은 기능을 수행하는 것을 하나의 이름으로 묶어서 제공함으로써 사용자가 편하게 쓸수있게 해주는 기능.
 *  - 함수명을 동일하게 하면서 (매개변수, 인자, argument)를 구분할 수 있어야한다.
 *    1) 매개변수 개수가 다를 경우
 *    2) 매개변수 타입이 다를 경우 
 *    *** return 타입이 다른 경우는 안됨/ 무조건 매개변수를 기준으로
 */
public class ClassExam01 {
	private int a;
	private char s;
	private float c;
	
	public static void main(String[] args) {
		ClassExam01 ce = new ClassExam01();
		ce.output(1,2);
		ce.output(3.4);
		ce.output(11);
		ce.output();
	}
	public void output() {
		System.out.println("Nothing");
	}
	public void output(int a) {
		System.out.println("a");
	}	
	public void output(int a, int b) {
		System.out.println("a,b");
		
	}
	public void output(double b) {
		System.out.println("b");
	}
}
