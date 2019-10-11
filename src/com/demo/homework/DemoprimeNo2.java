package com.demo.homework;

import java.util.Scanner;

public class DemoprimeNo2 {
  public static void CalPrimeNo(int n)
  {
	  int res=0;
	  for(int i=2;i<=n/2;i++)
	  {
		  res=n%i;
				  
	  }
	  if(res==0)
	  {
		  System.out.println(n+"No is not prime");
	  }
	  else
	  {
		  System.out.println(n+"No is prime");
		
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
       System.out.println("Please enter no=");
      int n=sc.nextInt();
       CalPrimeNo(n);
	}

}
