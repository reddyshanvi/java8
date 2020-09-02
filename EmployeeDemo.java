package com.eshanvi.session4;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {
		//Employee e=new Employee("eshanvi",100);
		//System.out.println(e);
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("durga",645353));
		al.add(new Employee("latha",343443));
		al.add(new Employee("anusuya",32545));
		System.out.println(al);
		Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);//here it is used sort the numbers based on ascending order and by using lambda expression
		System.out.println(al); 
		Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));//here it is used to sort based on alphabetical order of employee names
		System.out.println(al);
	}

}
