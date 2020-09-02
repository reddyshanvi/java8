package com.eshanvi.session5;

public class Test implements Interf
{
	public void m1()
	{
		System.out.println("Overriding version of defualt method");
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.m1();
	}
}
