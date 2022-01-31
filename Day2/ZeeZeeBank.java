package com.demo2;
import java.util.*;

public class ZeeZeeBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long acc,acc_bal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		acc=sc.nextLong();
		System.out.println("Enter the initial account balance ");
		acc_bal=sc.nextLong();
		System.out.println("Enter the aount to be deposited");
		long temp1=sc.nextLong();
		acc_bal+=temp1;
		System.out.println("Availabel Balance is "+acc_bal);
		System.out.println("Enter the amount to be withdrawn");
		long temp2=sc.nextLong();
		if(temp2>acc_bal) {
			System.out.println("Insufficient Balance");
		}
		else {
			acc_bal-=temp2;
			System.out.println("Available balance is "+acc_bal);
		}
		
	}

}
