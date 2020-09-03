package com.eshanvi.Assignments;

public class CompanyDemo 
{

	public static void main(String[] args) 
	{
		Company comp1=new Company(100,"Fresherspoint","Anvesh Reddy",1000000,"Richfeild","Minnesota",55423);
		Company comp2=new Company(101,"Learn Free","Akhilesh Reddy",2000000,"Los Angeles","California",91367);
		String myCompanyName;
		myCompanyName=comp1.getCompanyName();
		System.out.println("My companyName is:"+myCompanyName);
		myCompanyName=comp2.getCompanyName();
		System.out.println("My company name is:"+myCompanyName);
		String CompanyCity;
		CompanyCity=comp1.getCity();
		System.out.println("My Company City is: "+CompanyCity);
		CompanyCity=comp2.getCity();
		System.out.println("My company city is: "+CompanyCity);
		int myCompanyPostal;
		myCompanyPostal=comp1.getpostal();
		System.out.println("my company postal :"+myCompanyPostal);
		myCompanyPostal=comp2.getpostal();
		System.out.println("my company postal :"+myCompanyPostal);

	}

}
