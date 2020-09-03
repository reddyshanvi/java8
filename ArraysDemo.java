package com.Eshanvi.chapter17;
import java.util.*;
public class ArraysDemo {
	public static void main(String args[])
	{
		int array[]=new int[10];//here we are initializing and allocating an array
		for(int i=0;i<10;i++)//here it checks for condition first i is 0 then it checks whether i <10 or  not if it is true it enters into next line
			array[i]=-3*i;//here array[0]=-3*0=0 i.e array[0] is 0 and loop repeats until the condition becomes false
		System.out.print("Original contents:");
		dispaly(array);//here it dispaly the original contents of array
		Arrays.sort(array);//here it will sort the array 
		System.out.print("Sorted: ");
		dispaly(array);//and it display the sorted array
		Arrays.fill(array,2,6,-1);////here it puts fill the specified value from where we specify the start and end index
		System.out.print("After fill(): ");
		dispaly(array);//it displays after filling 
		Arrays.sort(array);//here it again sort the array
		System.out.print("After Sorting again: ");
		dispaly(array);//display the sorted array
		System.out.print("the value -9 at location ");
		int index=Arrays.binarySearch(array,-9);//here it searches for -9 where it is specified i.e is in which location in an array and stores the location in an index
		System.out.println(index);//here it prints the index
	}
	static void dispaly(int array[])
	{
		for(int i:array)
			System.out.print(i+" ");
		System.out.println();
	}
}
