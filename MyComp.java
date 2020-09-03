package com.Eshanvi.chapter17;
import java.util.*;
public class MyComp implements Comparator<String> 
{
	public int compare(String a,String b)//here we are declaring a method of string a and string b
	{
		String aStr,bStr;//here we are declaring an instance variable of String type
		aStr=a;//here a is assign to aStr
		bStr=b;//b is assign to bStr
		return bStr.compareTo(aStr);//here it returns the reverse of comparison i.e; it compares to strings
	}
}
