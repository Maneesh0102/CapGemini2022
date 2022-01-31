package com.demo;
import java.util.*;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,t;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Numbers before swapping are a is "+a+" and b is " +b);
		t=a;
		a=b;
		b=t;
		System.out.println("Numbers after swapping are a is "+a+" and b is " +b);

	}

}
