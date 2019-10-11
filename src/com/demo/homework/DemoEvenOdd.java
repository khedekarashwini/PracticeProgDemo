package com.demo.homework;

import java.util.Scanner;

public class DemoEvenOdd {
  public static boolean isEvenorOdd(int no)
  {
	  if(no%2==0)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no=");
	int no=sc.nextInt();
	  if(isEvenorOdd(no))
	  {
		  System.out.println(no+"\tNo is even");
	  }
	  else
	  {
		  System.out.println(no+"\tNo is odd");
	  }
	}

}
