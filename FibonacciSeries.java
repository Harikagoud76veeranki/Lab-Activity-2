package com.apj1;
//program to print fibonacci series
import java.util.Scanner;

public class FibonacciSeries {
	static void fib(int range) {
		int num1=0;int num2=1;int num3;int i = 0;
		while(i<=range) {
			num3=num1+num2;//num3=0+1
			System.out.println(" num1:" +num1+ " num2:" +num2+ " ==" +num3);
			num1=num2;//num1=1
			num2=num3;//num2=2
			i++;
		}
	}
	
	public static void main(String[] args) {
		FibonacciSeries fi=new FibonacciSeries();
		System.out.println("Enter your range: ");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		fi.fib(num);
		

	}
}











