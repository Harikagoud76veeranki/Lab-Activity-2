package com.apj1;
//withdraw amount which is withdrawn multiple times
import java.util.Scanner;
public class DemoBreak {

	public static void main(String[] args) {
		  
		int withdrawamount,sumAmount=0,ACbalance=120000; 
		  
		Scanner sc=new Scanner(System.in);
		  while(ACbalance>0) {
		  System.out.println("enter amount to withdraw : ");
		  withdrawamount=sc.nextInt();//amount to withdraw
		  sumAmount+=withdrawamount;//sumAmount=sumAmount+amount
		  if(sumAmount>50000) {
			  System.out.println("Amount limit Exceeded");
			  break;
		  }
		  ACbalance-=withdrawamount;
		System.out.println("A/c Balance= " +ACbalance+"Amount withdrawn:"+sumAmount);
		  }
		  }
}