package com.nttdata.asseration;

import java.util.Scanner;

public class Client 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		assert n<=10:"its valid number";
		System.out.println(n);
		
	}

}
