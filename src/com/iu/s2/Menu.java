package com.iu.s2;

import java.util.*;

public class Menu {
	
	void order(){
		
		Food_Source source;
		Food_Steak steakf;
		Food_Pasta pasta;

		Scanner sc= new Scanner(System.in);

		Shef_Steak steaks = new Shef_Steak();
		Shef_Pasta pastas = new Shef_Pasta();
		Shef_Source sources = new Shef_Source(); // 만든소스를 가져오기위해 클래스 생성
		Bill bill=new Bill();
		

		
		System.out.println("KH레스토랑");
		System.out.println("1.안심 스테이크|2.등십스테이크|3.립 스테이크");
		System.out.println("4.크림파스타|5.로제파스타|6.알리오올리오");
		System.out.print("입력:");
		int num=sc.nextInt();
		
		if (num >=1 && num <= 3) {
			steakf = steaks.makeSteak(num);
			source = sources.makeSource(1);
			if (steakf != null) {
				bill.billSteak(steakf);
			}
		}

		else if (num >=4 && num <=6) {
			pasta=pastas.makePasta(num);
			source = sources.makeSource(2);
			if (pasta != null) {
				bill.billPasta(pasta);
			}
		}

		else {
			System.out.println("메뉴가 없습니다.");
		}

	}
}
