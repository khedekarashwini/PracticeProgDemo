package com.demo.homework;

public class DemoRemovingnoInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="ashwni123";
   char ch[]=str.toCharArray();
   for (char c : ch) {
	   if(Character.isDigit(c))//removecharactor
     System.out.print(c);
  
   
  
   }
   String str1=str.replaceAll("[0-9]","");//removing no
   System.out.print(str1);
    
	}

}
