package com.iu.s2;

public class Shef_Pasta {
	
	//메서드명 makePasta
	//1.크림파스타 150000원
	//2.로제파스타 20000원
	//3.알리오 올리오 30000원
	


	Food_Pasta makePasta(int choice)//메서드 헤더
	{//메서드 바디
		
		Food_Pasta pasta = new Food_Pasta(); //스테이크하나만든다.
		Shef_Source s=new Shef_Source();	// 소스를만드는 Shef를 하나만든다.
		

		switch (choice) {	//매개변수로 입력받아 바로 switch
		case 1:
			pasta.name="크림 파스타 ";
			pasta.price=15000;
			pasta.source=s.makeSource(2);
			break;

		case 2:		
			pasta.name="로제 파스타";
			pasta.price=20000;
			pasta.source=s.makeSource(1);
			break;
			
		case 3:		
			pasta.name="알리오 올리오";
			pasta.price=30000;
			pasta.source=s.makeSource(1);
			break;

		default:
			break;
		}
		
		return pasta;
	}


}
