package com.eshanvi.Assignments;

public class Company
{
	int id;
	String companyName;
	String founderName;
	double Revenue;
	String city;
	String state;
	int postal;
	
	Company(int id,String companyName,String founderName,double Revenue,String city,String state,int postal){
		this.id=id;
		this.companyName=companyName;
		this.founderName=founderName;
		this.Revenue=Revenue;
		this.city=city;
		this.state=state;
		this.postal= postal;
	}
	String getCompanyName(){
		return companyName;
	}
	String getCity() {
		return city;
	}
	int getpostal() {
		return postal;
	}

}
