package com.nttdata.oops;

import java.util.Scanner;

public class Customer 
{
	int customerId ;
	String customerName;
	String customerAddress;
	public Customer() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the customer ID ");
		customerId = scanner.nextInt();
		System.out.println("enter the customer Name ");
		customerName = scanner.next();
		System.out.println("enter the customer Adress ");
		customerAddress = scanner.next();
		
	}
	public void display()
	{
		System.out.println("the deatails of customer are following: ");
		System.out.println("customer ID : "+customerId);
		System.out.println("customer name : "+customerName);
		System.out.println("customer adress : "+customerAddress);
	}
	
	
	

}
