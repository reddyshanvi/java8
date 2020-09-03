package com.eshanvi.chapter16;

public class IsDemo {

	public static void main(String[] args) 
	{
		char a[]= {'a','b','5','?','A',' '}; //here it creates an char array 
		for(int i=0;i<a.length;i++) {	// here it checks for condition if i=0 then it checks for i<a.length if it is true then enters into the loop
			if(Character.isDigit(a[i])) // here i=0 that is a if a is a digit then it prints if not then it moves to the next stmt
				System.out.println(a[i]+ "is a Digit");
			if(Character.isLetter(a[i]))//here if a is a letter then it prints moves to next statment and contunisouly hecks the condition 
				System.out.println(a[i]+ "is a letter");
			if(Character.isWhitespace(a[i]))
				System.out.println(a[i]+ "is a whitespace");
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i] + "is a uppercase");
			if(Character.isLowerCase(a[i])) //finally here it goes  and checks the a iis lowercase or not if it is true then it prints and for remainin it goes thrugh same process
				System.out.println(a[i]+ "is a lowercase");
	}
	}

}
