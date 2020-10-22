package com.nttdata.basics;

public class QuizSecond 
{
	public static void main(String[] args) 
	{
		int i = 8;
		System.out.println("orginal : "+Integer.toBinaryString(i));
		i>>=2;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
	}

}
