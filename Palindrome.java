package com.apj1;
//to check if the number is palindrome or not
import java.util.Scanner;
public class Palindrome {
	static void pal(int num) {
	int rem=0;int reversednum=0;int originalnum;
	originalnum=num;
	while(num>0) {
		rem=num%10;
		reversednum=reversednum*10+rem;
		num=num/10;
	}
	if(originalnum==reversednum) {
		System.out.println("It is a palindrome number");
	}
	else {
		System.out.println("it is not a palindrome number");
	}
}
	public static void main(String[] args) {
		Palindrome pa=new Palindrome();
		System.out.println("Enter your number: ");// if we enter 121 then it will print palindrome
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		pa.pal(num1);
		
		
		

	}

}
