package com.eshanvi.Assignments;

public class Profile 
{
	static int age=10;
	static int id;
	int zipcode=55423;
	static
	{
		System.out.println("in static block===");	
		age+=1;
		
	}
	static void setid(int i) {
		id=i;
	}
	static void getDetials(int x) {
		System.out.println("x==="+x);
		System.out.println("age=="+age);
	}
	int zipcode()
	{
		return zipcode;
	}
}
