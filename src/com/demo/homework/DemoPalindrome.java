package com.demo.homework;

import java.util.Scanner;

public class DemoPalindrome {
  public static void Paliandrome(int no)
  {
	  int reminder,rev=0,temp;
	  temp=no;
	  while(no>0)
	  {
		  reminder=no%10;
		  rev=rev*10+reminder;
		  no=no/10;
		  
	  }
	  if(temp==rev)
		  System.out.println(temp+" is plalindrome no");
	  
	  else
		  System.out.println(temp+" Not Palindrome no");
  }
  public static void ispalindromestring(String s)
  {
	 String original,rev="";
	 original=s;
	 int len=original.length();
	 for (int i = len-1; i >=0; i--) {
	rev=rev+original.charAt(i);	
	
	 }
	 
	 if(original.equals(rev))
		  System.out.println(original+" is Palindrome");
	  else
		  System.out.println(original+" Not palindrome");
  }
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		System.out.println("Enter string");
		String s=sc.next();
		int no=sc.nextInt();
		Paliandrome(no);
		ispalindromestring(s);
	

	}

}
