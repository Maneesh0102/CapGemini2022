package com.demo;
import java.util.*;

public class Vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		Scanner sc= new Scanner(System.in);
		a=sc.next().charAt(0);
		if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			System.out.println("The Charecter is a vowel");
		}
		else {
			System.out.println("The Charecter is a consonant");
		}
	}

}
