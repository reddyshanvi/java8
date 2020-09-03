package com.eshanvi.Assignments;

public class question5
{
	public static void main(String[] args)
	{
		int sum_integers[]= {10,20,30,40};
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum=sum+sum_integers[i];
		}
		System.out.println("sum of all elements of an array:"+sum);
	}

}
