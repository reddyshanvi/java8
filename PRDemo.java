package com.eshanvi.chapter16;

public class PRDemo
{
	public static void main(String[] args)
	{
		try
		{
			ProcessBuilder proc=new ProcessBuilder("notepad.exe","testfile");//here it opens the notepad automatially by saving with testfile i.e name of the program
			proc.start();//here it used to begun the execuation of a program
		}catch(Exception e)
		{
			System.out.println("error execuating notepad");
		}
	}

}
