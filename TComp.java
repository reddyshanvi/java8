package com.Eshanvi.chapter17;
import java.util.*;
public class TComp implements Comparator<String>
{
	public int compare(String a,String b)//here we are declaring a method of string a and string b
	{
		int i,j,k;//here we are declaring 3 instance variables of int type
		String aStr,bStr;//here we are declaring an instance variable of String type
		aStr=a;//here a is assign to aStr
		bStr=b;//b is assign to bStr
		i=aStr.lastIndexOf(' ');//to find  index of beginning of last name by using lastIndexOf() and stores into i
		j=bStr.lastIndexOf(' ');//to find  index of beginning of last name by using lastIndexOf() and stores into j
		k=aStr.substring(i).compareTo(bStr.substring(j));//here it compares the two strings
		if(k==0)//here it checks for condition if it is true it prints next line
			return aStr.compareTo(bStr);
		else						//else it prints k
			return k;
	}
}
