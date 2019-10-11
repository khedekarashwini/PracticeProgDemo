package com.demo.homework;

import java.util.Scanner;

public class DemoSwappingtwoNo {
public static void swapno(int x,int y)
{
	  x = x + y;  
	  y = x - y;  
	  x = x - y;
	  System.out.println("After swapping"+x+" "+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter two no");
 int x=sc.nextInt();
 int y=sc.nextInt();
  
 swapno(x,y);
	}

}
