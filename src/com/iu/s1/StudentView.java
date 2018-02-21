package com.iu.s1;

public class StudentView {

	void view(Student[] stuArray) {
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println("이름:" + stuArray[i].name);
			System.out.println("번호:" + stuArray[i].num);
			System.out.println("국어점수:" + stuArray[i].kor);
			System.out.println("수학점수:" + stuArray[i].math);
			System.out.println("영어점수:" + stuArray[i].eng);
			System.out.println("총점:" + stuArray[i].total);
			System.out.println("평균:" + stuArray[i].avg);
		}
	}
	
	void viewStudent(Student std) {
		if(std==null){
			System.out.println("번호가 없습니다.");
		
		}
		
		else {
			System.out.println("이름:" + std.name);
			System.out.println("번호:" + std.num);
			System.out.println("국어점수:" + std.kor);
			System.out.println("수학점수:" + std.math);
			System.out.println("영어점수:" + std.eng);
			System.out.println("총점:" + std.total);
			System.out.println("평균:" + std.avg);
		}
	}

}
