package com.iu.s3;

public class CarMain {

	public static void main(String[] args) {


		Car car2 = new Car("Black");
		car2.info();

		Car car3 = new Car("BMW","white");
		car3.info();
		
		Car car4 = new Car("BMW","white",10000);
		car4.info();
	}

}
