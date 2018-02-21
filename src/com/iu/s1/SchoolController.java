package com.iu.s1;

import java.util.*;

public class SchoolController {
	// 메서드명은 start
	// void
	// 1번:학생등록
	// 2번:성적입력
	// 3번:성적조회
	// 4번:전체조회
	// 5번:프로그램종료
	int menu;
	boolean check;

	void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력프로그램");
		StudentService sts = new StudentService(); // 객체생성
		Student std = new Student(); 		 // 객체생성
		StudentView stv = new StudentView(); // 객체생성
		Student[] stuArray = null; // while문 안에 선언하면 swtich문 한번돌면 다시 null로 변함.
		check = true;

		while (check) {
			System.out.println("1.학생등록|2.성적입력|3.성적조회|4.전체조회|5.프로그램종료");
			System.out.print("입력:");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("1.학생등록");
				stuArray = sts.addStudent();
				break;

			case 2:
				System.out.println("성적입력");
					stuArray = sts.addPoint(stuArray);
				break;

			case 3:
				System.out.println("성적조회");
				std=sts.searchStudent(stuArray);
				stv.viewStudent(std);
				break;

			case 4:
				System.out.println("전체조회");
				stv.view(stuArray);
				break;

			case 5:
				check = !check;
				break;

			default:
				System.out.println("잘못입력");
				break;
			}
		}
		System.out.println("종료");
		sc.close();
	}
}
