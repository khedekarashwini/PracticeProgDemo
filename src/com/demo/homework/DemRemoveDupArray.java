package com.demo.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DemRemoveDupArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList ls=new ArrayList<>();
		 ls.add(12);
		 ls.add(15);
		 ls.add(12);
		 ls.add(21);
		 ls.add(12);
		Set hs=new HashSet(ls);
		System.out.println(hs);
		
	}

}
