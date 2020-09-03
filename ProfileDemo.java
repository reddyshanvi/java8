package com.eshanvi.Assignments;

public class ProfileDemo
{
	public static void main(String[] args) 
	{
		//Profile p=new Profile( );
		Profile.getDetials(5);	//which calls the getdetails method passing 5 to x then it prints two println statements 
		Profile.setid(6);		// which calls the setid method by passing the value 6 to id and then it prints id value s.o.pl
		System.out.println("id value =="+Profile.id);  //prints the static id value

}
}