package com.Eshanvi.chapter17;
import java.util.*;
public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList<Integer> vals=new ArrayList<Integer>();//here it creates an arraylist of type integers
		vals.add(1);//here we adding the numbers to arraylist
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);
		System.out.println("original contents of vals:");//here it prints the statement which is enclosed within ""
		for(int v:vals)//here it checks for condition
			System.out.print(v+ " ");//it prints the elements 
		System.out.println();
		int sum=0;//here we initializing an instance variable with 0
		for(int v:vals)//here it checks for condition if it is true enters into the next line
			sum+=v;// here initialy sum is 0 adds with the v value and stores into sum and loop iteraters until the conditin become false
		System.out.println("sum of values:"+sum);//here it prints the sum value
	}

}
