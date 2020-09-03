package com.Eshanvi.chapter17;
import java.util.*;
public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<String,Double> tm=new TreeMap<String,Double>(new TComp() );//here it creates a treemap of type string and double
		tm.put("John Doe", new Double(3434.34));//here it puts the elements to map
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));
		Set<Map.Entry<String,Double>> set=tm.entrySet();//here to get a set of  the entries i.e the contents  of the map are dispalyed by  using a set view  ,obtained by calling entryset() method entryset () methods it returns a set that contains elements of a map 
		for(Map.Entry<String,Double> me:set)
		{
			System.out.print(me.getKey()+":");//here  the keys are displayed by using getkey()
			System.out.println(me.getValue());//here the values are diplayed by using getvalue() that are defined in mapentry
		}
		System.out.println();
		double balance=tm.get("John Doe");//here we are creating an double balance and we are getting the key i.e; john doe by using tm reference
		tm.put("John Doe",balance+1000);	//here putting the value of 1000 to preexisting value i.e;it replaces the preexisting value that is associated with specified key with the new value
		System.out.println("John doe's new balance is: "+tm.get("John Doe"));//here it prints updated john doe's balance


	}

}
