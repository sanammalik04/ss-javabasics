package com.ss.jb.prt2.Shape.Interface;

import java.util.Scanner;

public class Rectangle implements Shape {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the length and base of the rectangle : ");
		float length = userInput.nextFloat();
		float base = userInput.nextFloat();
		Rectangle rect = new Rectangle(length, base);
		System.out.println("Area : " + rect.area());
		userInput.close();
	}
	
	float length, base;
	Rectangle(float length, float base){
		this.length = length;
		this.base = base;
	}
	
	public float area() {
		return length * base;
	}
	
	
	

}
