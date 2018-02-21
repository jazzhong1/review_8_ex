package com.iu.s2;


public class Shef_Source {
	
	Food_Source makeSource(int choice)//메서드 헤더
	{//메서드 바디
		
		Food_Source source = new Food_Source(); //소스하나만든다.

		switch (choice) {	//매개변수로 입력받아 바로 switch
		case 1:
			source.oil_Name="Olive";
			source.spice_Name="Hub";
			break;

		case 2:		
			source.oil_Name="Milk";
			source.spice_Name="Cheese";
			break;

		default:
			break;
		}
		
		return source;
	}

}
