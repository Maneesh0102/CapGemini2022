package com.demo;
import java.util.*;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("The largest number is "+a);
			}
			else {
				System.out.println("The largest number is "+c);
			}
		}
		else {
			System.out.println("The largest number is "+b);
		}
	}

}
