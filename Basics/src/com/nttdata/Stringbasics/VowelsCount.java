package com.nttdata.Stringbasics;

import java.util.Scanner;

public class VowelsCount
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the data");
		String givenData = scanner.nextLine();
		int count = 0;
		for(int i=0; i<=givenData.length()-1;i++)
		{
			char a = givenData.charAt(i);
			if((a=='a') || (a=='e') || (a=='i') || (a=='o') || (a=='u'))
			{
				count++;
			}
		}
		System.out.println("number of vowels for given data is "+count);
	}

}
