package com.nttdata.oops;

import java.util.Scanner;

public class Product 
{
	int prouductId;
	String productName;
	String productCompany;
	
	public  void input() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the product ID ");
		prouductId = scanner.nextInt();
		System.out.println("enter the product Name ");
		productName = scanner.next();
		System.out.println("enter the product company ");
		productCompany = scanner.next();
		System.out.println("successfully details entered");
		
	}
	public void display()
	{
		System.out.println("the deatails of product are following: ");
		System.out.println("product ID : "+prouductId);
		System.out.println("customer name : "+productName);
		System.out.println("customer adress : "+productCompany);
		
	}
	
	

}
