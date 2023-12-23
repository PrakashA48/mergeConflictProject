package com.practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {

		boolean isprime = true;
		int num , temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number-");
		num = sc.nextInt();
		
		for(int i=2; i<num/2; i++) {// 11/2== 5
			temp = num%2;
			if(temp==0) {
				isprime = false;
				break;
			}
		}
		
		if(isprime) {
			System.out.println("The number is prime :"+num);
		}else {
			System.out.println("The number is not prime :"+num);
		}
		
	}

}
