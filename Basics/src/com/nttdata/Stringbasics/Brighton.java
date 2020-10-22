package com.nttdata.Stringbasics;

public class Brighton 
{
	public static void main(String[] args) 
	{
		String[] skilResorts = {"Whistler Blackcomb", "Squaw valley", "Brighton", "Snowmass","Sun valley","Taos"};
		String a;
		for(int i=0; i<=skilResorts.length-1;i++)
		{
			if("Brighton"==skilResorts[i])
			{
			System.out.println(skilResorts[i]);
			}
		}
		System.out.println("the value of skilResorts.length :"+skilResorts.length);
		System.out.println("index of the last item is :" +(skilResorts.length-1));
		System.out.println("value of expression skilResorts[4] :"+skilResorts[4]);
	}

}
