package com.eshanvi.session4;
import java.util.*;
public class Employee 
{
	String name;
	int eno;
	public  Employee(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return eno+":"+name;
	}
}
