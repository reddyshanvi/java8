package com.Eshanvi.chapter17;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm=new HashMap<String,Double>();
		hm.put("John Doe",new Double(3434.34));
		hm.put("Tom Smith",new Double(123.22));
		hm.put("Jane Baker",new Double(1378.00));
		hm.put("Tod Hall",new Double(99.22));
		hm.put("Ralph Smith",new Double(-19.28));
		Set<Map.Entry<String,Double>> set=hm.entrySet();
		for(Map.Entry<String,Double> me: set)
		{
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance=hm.get("John Doe");
		hm.put("John Doe",balance+1000);
		System.out.println("John doe's new balance is: "+hm.get("John Doe"));
	}

}
