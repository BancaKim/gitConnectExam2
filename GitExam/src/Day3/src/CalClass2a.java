import java.util.Scanner;

public class CalClass2a {
	private int num1, num2;
	private char ch;
	private char ans;
	private double result;

	public CalClass2a() {};
	public CalClass2a(int num1, char ch, int num2) {
		this.num1 = num1;
		this.ch = ch;
		this.num2 = num2;

	};
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public char getAns() {
		return ans;
	}
	public void setAns(char ans) {
		this.ans = ans;
	}
	
	public double plus(int n1, int n2) {
		return result = n1+n2;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		CalClass2a calc = new CalClass2a(num1, ch, num2);
		
		int num = sc.nextInt();
//		calc.setNum1(num);
		char ch = sc.next().charAt(0);
//		calc.setCh(ch);
		int num2 = sc.nextInt();
//		calc.setNum2(num2);
		CalClass2a calc = new CalClass2a(num,ch,num2);
		
		System.out.println(calc.getNum1()+""+calc.getCh()+""+calc.getNum2()+"=");
		System.out.println(calc.plus(num,num2));
	}}