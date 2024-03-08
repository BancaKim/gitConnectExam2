/*
 * 세 사람의 성적 처리 프로그램
 * 입력 : 이름,국,영,수
 * 연산 : 총점,평균
 * 출력 : 이름,국,영,수,총점,평균
 * 
 * int 배열 : 국,영,수,총점
 * 
 */

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {

		String[] name = new String[3];
		int[][] score = new int[3][4]; // 국어,영어,수학,총점
		float[] avg = new float[3];

		Scanner sc = new Scanner(System.in);

		// 입력 : 이름, 국어,영어,수학
		for (int i = 0; i < name.length; i++) {
			System.out.print("name input:");
			name[i] = sc.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print("score input:");
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
			}
		}

		// 연산 : 총점, 평균

		for (int i = 0; i < avg.length; i++) {
			avg[i] = score[i][3] / 3.f;
		}

		// 출력 : 이름,국어,영어,수학,총점,평균
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
		}

	}
}
