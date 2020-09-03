package com.Eshanvi.chapter17;
import java.util.*;
public class Address
{
	private String name;/* here we are declaring instance variables*/
	private String street;
	private String city;
	private String state;
	private String code;
	Address(String n,String s,String c,String st,String co)//here we are constructing parametized constructor
	{
		name=n;//here for example for first it assigns J.W West
		street=s; 
		city=c;
		state=st;
		code=co;
	}
	public String toString()// here we are creating a method toString
	{
		return name+"\n"+street+"\n"+city+" "+state+" "+code; //  here it returns name+"\n"+street+"\n"+city+" "+state+" "+code; 

	}
}
