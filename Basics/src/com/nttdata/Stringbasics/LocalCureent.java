package com.nttdata.Stringbasics;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalCureent 
{
	public static void main(String[] args) 
	{
		double amount = new Double(3459876.246);
		NumberFormat numberFormatter;
		String amountOut;
		Locale currentLocal = Locale.ITALIAN;
		numberFormatter = NumberFormat.getNumberInstance(currentLocal);
		amountOut = numberFormatter.format(amount);
		System.out.println(amountOut+" "+currentLocal.toString());
		
	}

}
