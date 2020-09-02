package com.eshanvi.session5;

public class Test2 implements left,Right
{
	public void m1()
	{
		System.out.println("our own method");
		left.super.m1();
	}
	public static void main(String[] args) 
	{
		Test2 t=new Test2();
		t.m1();
	}

}
