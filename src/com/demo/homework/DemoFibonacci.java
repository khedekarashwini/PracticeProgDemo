package com.demo.homework;

import java.util.Scanner;

public class DemoFibonacci {
   public static void printFibonacci(int no)
   {
	   int n1 = 0,n2=1,n3=0;
	   
	   for(int i=0;i<no;i++)
	   
	   {  n3=n1+n2;
		   System.out.println(n3);
	  n1=n2;
	  n2=n3;
	  
	}
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number=");
        int no=sc.nextInt();
        printFibonacci(no);
	}

}
