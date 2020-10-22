
package com.nttdata.oops;

import java.util.Scanner;

public class Client 
{
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Product p1 = new Product();
		int count=1;
		int choice=1;
		System.out.println("welcome to product simuation");
        for(int i=1; i<=100;i++)
        {
        	if(choice==1)
        	{
		        System.out.println("press 1 to enter details ");
		        System.out.println("press 2 to display details ");
		        count = scanner.nextInt();
		        if (count==1)
		       {
			       p1.input();
			   }
		      else if(count==2)
		       {
			       p1.display();
		       }  
		     else
		       {
			       System.out.println("entered only 1 or 2");
		       }
           }
           else 
        	{
        		System.out.println("thank you");
        		break;
        	 }
        	System.out.println("do you want to contuine yes/no");
    		System.out.println("1 yes"+"\n"+"2 no");
    		choice = scanner.nextInt();
		
		 }
	}
}
