package com.eshanvi.java8;

import java.util.function.Predicate;
//by using lambda expression
public class EvenOrNot {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));

	}

}
