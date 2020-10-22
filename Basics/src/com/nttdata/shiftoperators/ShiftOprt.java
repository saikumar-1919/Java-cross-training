package com.nttdata.shiftoperators;

public class ShiftOprt 
{
	public static void main(String[] args) 
	{
		int a = 8;
		System.out.println("orginal a: " + Integer.toBinaryString(a));
		int s1 = a<<1;
		System.out.println("shift left " + Integer.toBinaryString(s1));
		
	}

}
