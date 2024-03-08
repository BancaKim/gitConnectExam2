/*
 * instance method : 객체 생성 후 사용할 수 있음
 * static method : 객체 유무와 상관없이 사용가능
 * 
 */
public class CallByName {

	public static void main(String[] args) {
		CallByName.disp2(); 
		
		CallByName cbn = new CallByName();
		cbn.disp1();
		cbn.disp2();
		
		int num = 100;
		num = cbn.disp3(num);
		System.out.println(num);
		
		String str = new String("Superman");
		cbn.disp4(str);
		

	}
	
	public void disp4(String s) {   //call by reference 주소를 복사해서 붙여넣기, 같은 곳을 참조
		System.out.println(s);
	}
	
	
	public int disp3(int num) {  //call by value 는 값을 복사하는 것, num과 num이 같은 것이 아니다
		System.out.println(num);
		num++;
		System.out.println(num);
		return num;  // call by value 값을 주고 받는 행위
	}
	
	public void disp1() {  //call by name 받는것도, 주는것도 없음
		System.out.println("call by name 1");
	}
	public static void disp2() {  //call by name 받는것도, 주는것도 없음
		System.out.println("call by name 2");
	}
	

}
