package com.demo2;
import java.util.*;

public class Box {
	double length;
	double breadth;
	double height;
	void initialize(double a,double b, double c) {
		length=a;
		breadth=b;
		height=c;
	}
	double volume() {
		return length*breadth*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box();
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		b.initialize(l,w,h);
		System.out.println("Volume is "+b.volume());
	}

}
