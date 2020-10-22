package com.nttdata.Stringbasics;

public class ComputeResult 
{
	public static void main(String[] args) 
	{
		String org = "software";
		StringBuffer result = new StringBuffer("hi");
		int ind = org.indexOf('a');
		
		//1result.setCharAt(0, org.charAt(0));
	    //System.out.println(result);
		
		//2result.setCharAt(1, org.charAt(org.length()-1));
		//System.out.println(result);
		
		//3result.insert(1, org.charAt(4));
	    //System.out.println(result);
	    
	    //4result.append(org.substring(1,4));
	    //System.out.println(result);
		
		//5result.insert(1,(org.substring(ind, ind+2) + " " ));
		//System.out.println(result);
	}

}
