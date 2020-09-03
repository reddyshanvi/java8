package com.eshanvi.chapter16;
import java.io.*;

public class ParseDemo {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	// here it creates a bufferedreader  using system.in
		String str; 
		int i;
		int sum=0; //here it intiliazes with sum=0
		System.out.println("Enter numbers, 0 to quit."); //here 
		do
		{
			str=br.readLine();
			try
			{
				i=Integer.parseInt(str);
			}catch(NumberFormatException e)
			{
				System.out.println("Invalid format");
				i=0;
			}
			sum+=i;
			System.out.println("current sum is:"+sum);
		}while(i!=0);
	}

}
