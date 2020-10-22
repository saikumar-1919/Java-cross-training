package com.nttdata.basics;

public class QuizThird 
{
	public static void main(String[] args) 
	{
		int i = 17;
		System.out.println("orginal :" +Integer.toBinaryString(i));
		i>>=1;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
	}

}
