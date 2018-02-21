package com.iu.s1;

import java.util.*;

public class StudentService {
	// 학생 추가메서드
	// 메서드명 addStudent
	// 학생의 인원수 입력
	// 학생 수만큼
	// 이름입력
	// 번호입력

	Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력");
		int count = sc.nextInt();
		Student[] ar = new Student[count];

		boolean check1 = false;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Student(); // 배열 인덱스안에 비었기때문에 집어넣어줘야한다.
									// 배열인덱스안에 객체가 있어야 사용가능하다.
			System.out.print("이름입력:");
			ar[i].name = sc.next();

			System.out.print("번호입력:");
			ar[i].num = sc.nextInt();

			for (int j = 0; j < i; j++) { // 범위로 처음에 입력받고 0과 1비교
				// 같다면 j=j-;
				if (ar[i].num == ar[j].num) {
					System.out.println("번호가 중복됩니다");
					i--;
					check1 = !check1;
					break;
				}
			}
			if (check1) {
				continue; // 증감식으로 이동
			}

		}

		return ar;
	}

	Student[] addPoint(Student[] ar) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {

			System.out.print("국어점수입력:");
			ar[i].kor = sc.nextInt();
			System.out.print("수학점수입력:");
			ar[i].math = sc.nextInt();
			System.out.print("영어점수입력:");
			ar[i].eng = sc.nextInt();
			ar[i].total = ar[i].kor + ar[i].math + ar[i].eng;
			ar[i].avg = ar[i].total / (double) ar.length;
		}
		return ar;
	}

	Student searchStudent(Student[] ar) {
		Scanner sc = new Scanner(System.in);
		Student stu = null;
		System.out.print("학생번호입력:");
		int num = sc.nextInt();

		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i].num) {
				stu = ar[i];
			}
		}

		return stu;
	}

	// 메서드명 addPoint
	// 내용 = 각 학생의 점수입력

}
