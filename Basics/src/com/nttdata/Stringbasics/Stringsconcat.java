package com.nttdata.Stringbasics;

public class Stringsconcat 
{
	public static void main(String[] args) 
	{
		String hi = "hi, ";
		String mom = "mom.";
		String s2;
		s2 = hi+mom;
		System.out.println(s2);
		
		System.out.println("second way");
		StringBuffer a1 = new StringBuffer("hi, ");
		StringBuffer a2 = new StringBuffer("mom.");
		StringBuffer a3 = a1.append(a2);
		System.out.println(a3);
	}
	

}
