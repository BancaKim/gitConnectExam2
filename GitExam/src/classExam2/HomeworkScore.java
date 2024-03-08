package classExam2;

import java.util.Scanner;

public class HomeworkScore {

	public static void main(String[] args) {
		// 100명까지 할거다 100명 어레이
		// 1.학생성적 입력
		// 2.학생성적 수정 누구를 수정하실건가요? 무엇을 수정하실건가요? 1.국 2.영 3.수 4.다시 (총점,평균계산)
		// 3.학생성적 검색 1. 이름 검색 2.평균검색 (50) 50점 이상인 모든 학생 출력
		// 4.학생성적 출력 (전체출력)

		String con;
		int choiceMenu;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 숫자를 입력해주세요.");
		int num = sc.nextInt();
		while (num > 100) {
			System.out.print("100명 이하로 작성해주세요.:");
			num = sc.nextInt();
		}
		StudentScoreHasA[] stu = new StudentScoreHasA[num];

		do {
			System.out.print("학생 성적 계산기에 오신걸 환영합니다. 1.학생성적입력 2.학생성적수정 3.학생성적검색 4.학생성적출력 5.종료:");
			choiceMenu = sc.nextInt();

			switch (choiceMenu) {
			case 1:
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
				break;
			case 2:
				System.out.print("수정하려는 학생 이름을 검색해주세요.:");
				String modifiedName = sc.next();
				for (int i = 0; i < stu.length; i++) {
					if (stu[i].getName().equalsIgnoreCase(modifiedName)) {
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
				}
				break;
			case 3:
				System.out.print("1.이름검색 2.평균 50 이상 검색:");
				int searchCon = sc.nextInt();
				if (searchCon == 1) {
					System.out.print("이름을 입력해주세요.:");
					String searchName = sc.next();
					for (int i = 0; i < stu.length; i++) {
						if (stu[i].getName().equalsIgnoreCase(searchName)) {
							System.out.print(stu[i].getName() + "\t");
							System.out.print(stu[i].getKor() + "\t");
							System.out.print(stu[i].getMat() + "\t");
							System.out.print(stu[i].getEng() + "\t");
							System.out.print(stu[i].getTotal() + "\t");
							System.out.print(stu[i].getAvg());
							System.out.println();
						}
					}
				} else if (searchCon == 2) {
					for (int i = 0; i < stu.length; i++) {
						if (stu[i].getAvg()>=50) {
							System.out.print(stu[i].getName() + "\t");
							System.out.print(stu[i].getKor() + "\t");
							System.out.print(stu[i].getMat() + "\t");
							System.out.print(stu[i].getEng() + "\t");
							System.out.print(stu[i].getTotal() + "\t");
							System.out.print(stu[i].getAvg());
							System.out.println();
						}
					}
				}
				break;
			case 4:
				for (int j = 0; j < num; j++) {
					System.out.print(stu[j].getName() + "\t");
					System.out.print(stu[j].getKor() + "\t");
					System.out.print(stu[j].getMat() + "\t");
					System.out.print(stu[j].getEng() + "\t");
					System.out.print(stu[j].getTotal() + "\t");
					System.out.print(stu[j].getAvg());
					System.out.println();
				}
				break;
			case 5:
				break;
			}
		} while (choiceMenu != 5);
	}
}
