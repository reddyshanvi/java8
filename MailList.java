package com.Eshanvi.chapter17;
import java.util.*;
public class MailList {

	public static void main(String[] args) {
		LinkedList<Address> ml=new LinkedList<Address>();
		ml.add(new Address("J.W West","11 Oak Ave","Urbana","IL","61801"));
		ml.add(new Address("Ralph Baker","1142 Maple lane","Mohamet","IL","61853"));
		ml.add(new Address("Tom carlton","867 Elm St","champaign","IL","61820"));
		for(Address element:ml)
			System.out.println(element+"\n");
		System.out.println();


	}

}
