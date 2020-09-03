package com.Eshanvi.chapter17;
import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> adq=new ArrayDeque<String>();//here we are creating an arraydeque of type String
		adq.push("A");//here we are using arraydeque as stack and pushing the elements to stack
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.print("popping the stack:");//here it prints the statement as poping the stack in console
		while(adq.peek()!=null)//here it checks for condition if it not equal to null then it enter into next line
			System.out.print(adq.pop()+" ");//here it  pop the elements from stack and continunes the process until adq.peek() retuns null and prints the output
		System.out.println();
	}

}
