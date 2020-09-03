package com.Eshanvi.chapter17;
import java.util.*;
public class AlgorithmDemo {

	public static void main(String[] args) {
		LinkedList<Integer> Ll=new LinkedList<Integer>();//here it creates a linkedlist of type Integer
		Ll.add(-8);//here it adds  elements to Ll
		Ll.add(20);
		Ll.add(-20);
		Ll.add(8);
		Comparator<Integer> r=Collections.reverseOrder();//creating a reverse order comparator
		Collections.sort(Ll,r);//here we are sorting the list by using the comparator
		System.out.println("List sorted in reverse order");
		for(int i:Ll)//here it checks for condition
			System.out.print(i+" ");//here it prints the elements
		System.out.println();
		Collections.shuffle(Ll);//to shuffle the list we using shuffle(Ll)
		System.out.print("List shuffled:");
		for(int i:Ll)
			System.out.print(i+" ");//here it prints the list shuffled
		System.out.println();
		System.out.println("Maximum: "+Collections.max(Ll));//here it prints the max value in Ll by using max()
		System.out.println("Minimum "+Collections.min(Ll));//here it prints the min value in lL BY USING MIN()
	}

}
