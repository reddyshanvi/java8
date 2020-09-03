package com.eshanvi.chapter17;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//here creating an arraylist for objects of type string
		System.out.println("Initial size of al:"+al.size()); //here it prints the initial size of arraylist by using size()
		al.add("C");//here we are adding to arraylist by using add() by using reference al i.e;al.add()
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1,"A2");//here by specifying al.add(1,A2)means in arraylist at index 1 it replaces the A with A2
		System.out.println("size of al after additions: "+al.size());//here it prints the size after addition
		System.out.println("contents of al: "+al);//here it prints the elements of al
		al.remove("F");//here it removes F
		al.remove(2);// here it removes A 
		System.out.println("size of al after deletions: "+al.size());//here it printss the size after deletion
		System.out.println("contents of al: "+al);
	}

}
