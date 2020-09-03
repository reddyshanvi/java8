package com.eshanvi.chapter16;

public class MemoryDemo 
{
	public static void main(String[] args)
	{
		Runtime r=Runtime.getRuntime();// here for runtime we cannot insitiate an runtime object and we want to get a reference of current runtime object we can get by using Runtime..getRuntime()
		long mem1,mem2; // here we are creating 2 instance variables mem1 and mem2
		Integer someints[]=new Integer[1000];	//here we are creating a Integer object 
		System.out.println("Total memory is: "+r.totalMemory()); //here it prints the total memory 
		mem1=r.freeMemory();//by calling free memory by r reference it stores into mem1
		System.out.println("initial free memory: "+mem1); //it prints the intial free memory
		r.gc();//it intiates garbage collection
		mem1=r.freeMemory(); // after garbage collection it checks for free memory by calling freememory() by using r and stores into mem1
		System.out.println("Free memory after garbage collection: "+mem1);//here it checks after garbage collection how much free memory is there
		for(int i=0;i<1000;i++)
			someints[i]=new Integer(i);//it allocates the integers
		mem2=r.freeMemory();//after allocation it checks the free memory and stores into mem2
		System.out.println("Free memory after allocation : "+mem2);// here it prints the mem2
		System.out.println("Memory used by allocation: "+(mem1-mem2)); //here it prints the memory used by allocaation
		for(int i=0;i<1000;i++)
			someints[i]=null;//here it discarded integers
		r.gc();// it request to garbage collection
		mem2=r.freeMemory();//after collecting discarded integers it checks for free memory and storesinto mem2
		System.out.println("Free memory after collecting"+"Discarded integers:"+mem2);
	}

}
