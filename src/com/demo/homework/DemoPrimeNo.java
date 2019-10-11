package com.demo.homework;

import java.util.Scanner;

public class DemoPrimeNo {
   
	public static boolean calculateprimeno(int n)
    {
    	if(n<=1)
    	{
    		return false;
    	}
    for(int i=2;i<=n/2;i++)
    {
    	if(n%i==0)
    	{
    		return false;
    	}
    }
    return true;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoPrimeNo dn=new DemoPrimeNo();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no=");
	int n=sc.nextInt();
	  
	if(calculateprimeno(n))
	{
		System.out.println("Prime no is"+n);
		
	}
	else
	{
		System.out.println("This no is not prime="+n);
	}
}


	
}