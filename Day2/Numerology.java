package com.demo2;
import java.util.*;

public class Numerology {
	int process(int n)
	{
		int sum1=0;
		while(n>0) {
			sum1+=(n%10);
			n=n/10;
		}
		return sum1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,e=0,o=0;
		while(n>0)
		{
			int t=n%10;
			if(t%2==0) {
				e+=1;
			}   
			else {
				o+=1;
			}
			sum+=t;
			n=n/10;
		}
		int temp=sum;
		Numerology c=new Numerology();
		while(temp>9)
		{
			temp=c.process(temp);
		}
		
		System.out.println("Sum of digits is"+sum);
		System.out.println("Numerology number="+temp);
		System.out.println("Number of even digits are "+e);
		System.out.println("Number of even digits are "+o);
		
	}

}
