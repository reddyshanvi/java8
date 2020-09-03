package com.eshanvi.chapter16;

public class InfNaN {

	public static void main(String[] args) {
		Double d1=new Double(1/0.);// here it creates two double objects
		Double d2=new Double(0/0.);
		System.out.println(d1+":"+d1.isInfinite()+","+d1.isNaN());// here d1 returns true for isInfinite bcz here the value will test whether it is large or small and d1 returns false for isNaN() 
		System.out.println(d2+":"+d2.isInfinite()+","+d2.isNaN());// here d2 returns false for isInfinite and true for isNan

	}

}
