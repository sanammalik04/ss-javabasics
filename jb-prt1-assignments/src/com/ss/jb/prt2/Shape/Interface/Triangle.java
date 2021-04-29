package com.ss.jb.prt2.Shape.Interface;

import java.util.Scanner;

public class Triangle implements Shape {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the 3 sides of the triangle : ");
		float side1 = userInput.nextFloat();
		float side2 = userInput.nextFloat();
		float side3 = userInput.nextFloat();
		Triangle tri = new Triangle(side1, side2, side3);
		System.out.println("Area : " + tri.area());
		userInput.close();
	}
	
	float side1, side2, side3;
	Triangle(float side1, float side2, float side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	public float area() {
		float A = (side1 + side2 + side3)/2;
		
		float area = (float)Math.pow((double)(A * (A-side1) * (A-side2) * (A-side3)), 0.5);
		return area;
	}
	
	
	
}
