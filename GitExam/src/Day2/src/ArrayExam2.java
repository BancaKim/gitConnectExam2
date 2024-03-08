/*
 * n 사람의 성적 처리 프로그램
 * 입력 : 이름,국,영,수
 * 연산 : 총점,평균
 * 출력 : 이름,국,영,수,총점,평균
 * int 배열 : 국,영,수,총점
 * 
 */

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = ArrayExam2.personNum(sc); // 사람 수 입력
		String[] name = new String[num];
		int[][] score = new int[num][4]; // 국어,영어,수학,총점
		float[] avg = new float[num];

		// 입력 : 이름,국어,영어,수학,총점

		for (int i = 0; i < num; i++) {
			name[i] = ArrayExam2.nameInput(sc); // 이름 입력

			for (int j = 0; j < score[i].length - 1; j++) {
				score[i][j] = ArrayExam2.scoreInput(sc); // 점수 입력
				score[i][3] += score[i][j];
			}
		}
		// 연산 : 평균
		for (int i = 0; i < avg.length; i++) {
			avg[i] = score[i][3] / 3.f;
		}
		// 출력 : 이름,국어,영어,수학,총점,평균
		ArrayExam2.display(num, name, score, avg);

	}

	public static void display(int num, String[] name, int[][] score, float[] avg) {
		for (int i = 0; i < num; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
		}

	}

	public static int personNum(Scanner sc) {
		System.out.print("how many people?:");
		return sc.nextInt();
	}

	public static String nameInput(Scanner sc) {
		System.out.print("name input:");
		return sc.next();
	}

	public static int scoreInput(Scanner sc) {
		System.out.print("score input:");
		return sc.nextInt();
	}
}
