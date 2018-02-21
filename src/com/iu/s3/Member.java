package com.iu.s3;

public class Member {
	
	String name;
	int age;
	
	Member(String name,int age) {	//클래스이름을갖는 메서드다.
		System.out.println("멤버변수의 초기화");
		System.out.println("생성자 실행\n");
		this.name="홍성진";
		this.age=26;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
	}

}
