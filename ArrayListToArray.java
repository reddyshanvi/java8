package com.eshanvi.chapter17;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();//here we creating an arraylist for integers
		al.add(1);//here adding elemts to arraylist
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("contens of al: "+al);//here it prints the contents of al
		Integer ia[]=new Integer[al.size()];//here it obtains an array for integers
		ia=al.toArray(ia);//toArray is used to obtain an array 
		int sum=0;//here we are iitializing a sum with 0
		for(int i:ia)//here we are using for each loop
			sum+=i;//here it add the elemts and stores into sum
		System.out.println("sum is:"+sum);//here it prints sum value

	}

}
