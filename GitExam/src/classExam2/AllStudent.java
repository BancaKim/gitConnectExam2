package classExam2;

import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {
		System.out.print("학생 수를 입력해주세요.:");   

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 학생 수를 만드세요
		StudentScoreHasA[] stu = new StudentScoreHasA[num];

		for (int i = 0; i < num; i++) {
			stu[i] = new StudentScoreHasA();
			System.out.print("이름을 입력하세요.:");
			stu[i].setName(sc.next());
			System.out.print("국어점수를 입력하세요.:");
			stu[i].setKor(sc.nextInt());
			System.out.print("수학점수를 입력하세요.:");
			stu[i].setMat(sc.nextInt());
			System.out.print("영어점수를 입력하세요.:");
			stu[i].setEng(sc.nextInt());
		}

		for (int j = 0; j < num; j++) {
			System.out.print(stu[j].getName() + "\t");
			System.out.print(stu[j].getKor() + "\t");
			System.out.print(stu[j].getMat() + "\t");
			System.out.print(stu[j].getEng() + "\t");
			System.out.print(stu[j].getTotal() + "\t");
			System.out.print(stu[j].getAvg());
			System.out.println();
		}

	}

}
