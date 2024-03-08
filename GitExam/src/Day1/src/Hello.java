/*
이름 규칙
1. 클래스 : 첫글자는 대문자로 작성
2. 매소드, 변수 : 소문자로 작성 (변수 : 상수를 저장하는 메모리 공간)
3. 상수 : 전부 대문자 MAX  (상수 : 변하지 않는 값) 
4. 단어와 단어가 이어질 때 두번째 단어의 첫글자는 대문자로 작성 blackWhite, BlackWhite


DataType
1. Primitive type
	문자형 char 2byte
	정수형 byte, short, int(default), long
	실수형 float, double(default) 
2. Reference type : reference 변수를 사용
	- 배열, 객체, enum 등등
	-  
Casting
	1. 자동형변환 3 + 4.2    int+double = error -> 서로 다른 타입은 연산이 불가능하다 3.0(casting) + 4.2 = 7.2 
	2. 강제형변환 3//4 = 0 -> (double)3//(double)4 = 0.75
2.  
*/
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {  //프로그램을 시작해주고 끝내줌
		/*datatype 변수명 ; 
		  변수명 = 값; == 초기화
		  변수 - 지역변수 local variable : method안에 선언되어지는 변수, 항상 꼭 초기화를 해야함
		  
		*/
		
//		int num;
//		num = 10;
//		
//		char ch = 'A'; //"" 문자열		
//		
//		System.out.println(num);
//		System.out.println(ch);
//		
//		Hello hello; // hello는 레퍼런스변수
//		hello = new Hello(); //객체 생성   new 동적메모리 할당 (힙에 메모리를 잡겠다)
//
//		System.out.println("hello");
//		System.out.println(333+"\n");
//		
//		System.out.print("hello"+333);
//		System.out.print(333);

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		System.out.println(str);
		System.out.println(num);
	}
}