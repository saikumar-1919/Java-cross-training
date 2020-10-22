package com.nttdata.Stringbasics;

import java.util.Scanner;

public class Initials 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the full name");
		String givenData = scanner.nextLine();
		System.out.print(givenData.charAt(0)+" ");
		for(int i=0; i<=givenData.length()-1;i++)
		{
			char a = givenData.charAt(i);
			if(a==' ')
			{
				System.out.print(givenData.charAt(i+1)+" ");
			}
		}
	}

}
