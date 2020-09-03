package com.Eshanvi.chapter17;
import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//here we are creating a array list of type string
		al.add("c");//here we are adding elements to al
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println(" original contents of al");//here it prints the statement which is enclosed within invented commas
		Iterator<String> itr=al.iterator();//here to obtain an iterator to start  of the collection by calling iterator method
 		while(itr.hasNext())//here it set up a loop   that makes a call hasNext() by using itr reference the loop iterate as long as hasNext() returns true
		{
			String element=itr.next();//here it obtains each element by using next()
			System.out.print(element+" ");//here it prints elements
		}
		System.out.println();
		ListIterator<String> litr=al.listIterator();//here it creates a listIterator you can also obtain an iterato by using listiteratori.e modify objects that have being iterated
		while(litr.hasNext())//here it setup up a loop that makes a call hasNext() by using litr reference the loop iterate as long as hasnext() returns true
		{
			String element=litr.next();
			litr.set(element+"+");	//here it set the each element by "+"
		}
		System.out.println("modified contents of al:");//here it prints the statement which is enclosed within the invented commas
		itr=al.iterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.print(element+" ");//here it prints modified elements of al
		}System.out.println();
		System.out.println("modified list backward:");
		while(litr.hasPrevious())//here it setup a loop that makes a call hasprevious()by using litr reference
		{
			String element=litr.previous();//here it obtains the elements by using previous i.e; reverse direction 
			System.out.print(element+" ");//here it prints the elements
		}
		System.out.println();

	}

}
