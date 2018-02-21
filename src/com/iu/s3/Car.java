package com.iu.s3;

public class Car {
	
	//기본생성자가 없고 다른생성자가 있을경우 기본생성자 호출시 에러발생
	//의도적으로 생성자에 매개변수를 넣고자할땐 기본생성자를 사용하지않는다.
	
	String color;
	String brand;
	int cc;
	
	Car() {
		this("RED");//자신의 또다른 생성자 호출
					//비어있기때문에 값을 대입해줘야한다.
	}
	
	Car(String color){
							//변수명 만드느게 힘들다.
							//최대한 같은역활은 같은 변수명으로
		this(color,"Audi");	//자신의 또다른 생성자 호출시 생성자 라인에 첫줄에 기술
	}
	
	
	
	Car(String brand,String color){
		//해석할때 사용하고 직접 만들일은 없다.
		//맴버변수주소값.
		this(color,brand,500);
	}
	

	Car(String brand,String color,int cc){
		this.color=color;
		this.brand=brand;
		this.cc=cc;
	}
	
	
	void make(){
		System.out.println("자동차 제작완료");
	}
	
	void info(){
		System.out.println("Color:"+color);
		System.out.println("Brand:"+brand);
		System.out.println("cc:"+cc);
		this.make();
	}

}
