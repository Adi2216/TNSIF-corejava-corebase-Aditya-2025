package com.tnsif.daynine.Strings;

public class SampleStringDemo {
	public static void main(String[] args) {
		// initialize string
		
		char c[]= {'i','n','d','i','a'};
		String s1=new String(c);
		System.out.println(s1);
		
		
		String s2=new String(s1);
		System.out.println(s2);
		
		//Concantination to prevent long lines 
		
	String longstr="this is to show"+"How to long sentences"+"\t"+"can be printed";
	System.out.println(longstr);
	}

}
