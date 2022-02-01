package com.demo2;
import test_package;
import test_package.foundation;

public class Access_modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foundation f=new foundation();
		//System.out.println("private variable "+f.a);
		//System.out.println("default variable "+f.b);
		//System.out.println("protected variable "+f.c);
		System.out.println("public variable "+f.d);
	}

}
