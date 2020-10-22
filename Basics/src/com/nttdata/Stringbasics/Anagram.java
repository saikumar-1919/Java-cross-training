package com.nttdata.Stringbasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String a = "parliament";
		String b = "partialmen";
		int count=0;
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		for(int i=0; i<=a1.length-1;i++)
		{
			if(a1[i]==b1[i])
			{
				count =1;
			}
			else
			{
				count=0;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
		
	}

	
}
