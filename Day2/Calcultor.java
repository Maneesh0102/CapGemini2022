package com.demo2;

public class Calcultor {
	static int powerInt(int n1,int n2) {
		int pow=1;
		while(n2>0) {
			pow*=n1;
			n2-=1;
		}
		return pow;
	}
	static double powerdouble(double n1,int n2) {
		double pow=1.0;
		while(n2>0) {
			pow*=n1;
			n2-=1;
		}
		return pow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result is "+Calcultor.powerInt(2,4));
		System.out.println("Result is "+Calcultor.powerdouble(2.0,4));
	}

}
