package com.eshanvi.chapter16;

public class DoubleDemo
{
	public static void main(String[] args)
	{
		Double d1=new Double(3.14159);	// here we are creating two Double objects here by passing value
		Double d2=new Double("314159E-5");// here by passing a string that can b parsed as double
		System.out.println(d1+"="+d2+"->"+d1.equals(d2));	//here it checks d1 equals (d2) it is true prints the output
	}

}
