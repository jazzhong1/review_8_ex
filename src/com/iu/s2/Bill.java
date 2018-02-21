package com.iu.s2;

public class Bill {
	//steak먹었을때 영수증
	void billSteak(Food_Steak steak){
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oil_Name);
		System.out.println(steak.source.spice_Name);
	}
	
	//pasta 먹었을때 영수증
	
	void billPasta(Food_Pasta pasta){

		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oil_Name);
		System.out.println(pasta.source.spice_Name);
		
	}
}
