package com.eshanvi.chapter16;

public class Elapsed {
	public static void main(String[] args) {
		long start, end;//here it creates instance variables start and end
		System.out.println("Timing a for loop  from 0 to 1,000,000");
		start=System.currentTimeMillis();//get starting time by using currenttimemillies() 
		for(int i=0;i<1000000;i++);
			end=System.currentTimeMillis();//here we get end time 
		System.out.println("Elapsed time: " + (end-start));//here we get elpapsed time
			
	}

}
