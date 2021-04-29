package com.ss.jb.prt2.Shape.Interface;

import java.util.Scanner;

public class Circle implements Shape {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		float radius = userInput.nextFloat();
		Circle cir = new Circle(radius);
		System.out.println("Area : " + cir.area());
		userInput.close();
	}
	
	float radius;
	
	Circle(float radius) {
		this.radius = radius;
		
	}
	
	public float area() {
		return (3.14f * radius * radius);
	}
	

	


}
