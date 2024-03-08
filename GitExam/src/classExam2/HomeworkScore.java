package classExam2;

import java.util.Scanner;

public class HomeworkScore {
	
	public static void main(String[] args) {
		//100명까지 할거다 100명 어레이 
		//1.학생성적 입력
		//2.학생성적 수정 누구를 수정하실건가요? 무엇을 수정하실건가요? 1.국 2.영 3.수 4.다시  (총점,평균계산)
		//3.학생성적 검색 1. 이름 검색 2.평균검색 (50) 50점 이상인 모든 학생 출력
		//4.학생성적 출력 (전체출력)
		
			Scanner sc = new Scanner(System.in);
			System.out.print("학생 성적 계산기에 오신걸 환영합니다. 1.학생성적입력 2.학생성적수정 3.학생성적검색 4.학생성적출력 5.종료:");
			int choiceMenu = sc.nextInt();
			switch (choiceMenu) {
			case 1: 
				System.out.print("학생 숫자를 입력해주세요.");
				int num = sc.nextInt();
				while (num>100) {
					System.out.print("100명 이하로 작성해주세요.:");
					num = sc.nextInt();
				} 
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

				
				
			case 2: 
				
				
			case 3:
				
				
			case 4:
				
			
			case 5:
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

