package com.Eshanvi.chapter17;
import java.util.*;
public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();//here it creates the treeset of type string
		ts.add("C");//here it add elements to treeset
		ts.add("H");
		ts.add("M");
		ts.add("A");
		ts.add("B");
		ts.add("N");
		System.out.println(ts);//here it prints the output in sorted order
	}

}
