package com.nttdata.Stringbasics;

import java.util.Scanner;

public class IntToHex 
{
	public static void main(String[] args) 
	{
		int a=0;
		String s ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the integer");
		int n = scanner.nextInt();
		s=Integer.toHexString(n);
		
		/*while(n>0)
		{
			a=n%16;
			if(a==10)
			{
				s='A'+s;
			}
			else if(a==11)
			{
				s='B'+s;				
			}
			else if(a==12)
			{
				s='C'+s;
			}
			else if(a==13)
			{
				s='D'+s;
			}
			else if(a==14)
			{
				s='E'+s;
			}
			else if(a==15)
			{
				s='F'+s;
			}
			else
			{
				s=a+s;
			}
			n=n/16;
					
			
		}*/
		System.out.println("hexaString: "+s);
		
	}

}
