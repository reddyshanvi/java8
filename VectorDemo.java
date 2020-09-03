package com.Eshanvi.chapter17;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>(3,2);//here we are creating a vector of type Integer with initial capacity 3 and increament is 2
		System.out.println("Intial Size: "+v.size());//here it displays the size
		System.out.println("Initial capacity "+v.capacity());//here it displays the initial capacity 
		v.addElement(1);//here we adding elements to v
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity after  four additions :"+v.capacity());//here it display the capacity after 4 additions
		v.addElement(5);//here we are adding another element
		System.out.println("Current capacity: "+v.capacity());//here it displays the current capacity after adding another element
		v.addElement(6);
		v.addElement(7);
		System.out.println("current capacity "+v.capacity());
		v.addElement(9);
		v.addElement(10);
		System.out.println("current capacity :"+v.capacity());
		v.addElement(11);
		v.addElement(12);
		System.out.println("First element :"+v.firstElement());//here it displays the first element  by using firstElement()
		System.out.println("last element :"+v.lastElement());//here it displays the last element by using lastElement()
		if(v.contains(3))//here it checks whether 3 is there in v or not if it is there moves not next line
			System.out.println("Vector contains 3.");//here it prints 
		Enumeration vEnum=v.elements();//enumerate the elements in the vector
		System.out.println("\n Elements in vector");
		while(vEnum.hasMoreElements())//here it checks for is there any more elements
			System.out.print(vEnum.nextElement());//here it prints the elements 
		System.out.println();
	}

}
