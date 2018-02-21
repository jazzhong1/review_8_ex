package com.iu.s2;

public class Shef_Steak {
	

	Food_Steak makeSteak(int choice)//메서드 헤더
	{//메서드 바디
		
		Food_Steak steak = new Food_Steak(); //스테이크하나만든다.
		Shef_Source s=new Shef_Source();	// 소스를만드는 Shef를 하나만든다.
		

		switch (choice) {	//매개변수로 입력받아 바로 switch
		case 1:
			steak.name="안심 스테이크";
			steak.price=30000;
			steak.source=s.makeSource(1);
			break;

		case 2:		
			steak.name="등심 스테이크";
			steak.price=40000;
			steak.source=s.makeSource(2);
			break;
			
		case 3:		
			steak.name="립스테이크";
			steak.price=50000;
			steak.source=s.makeSource(1);
			break;

		default:
			break;
		}
		
		return steak;
	}


}
