package com.eshanvi.chapter16;

public class ExecDemoFini {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		Process p=null;
		try
		{
			p=r.exec("notepad"); //it opens(or) excuates notepad
			p.waitFor();//here it waits for program to wait until the subprocesses finishes
		}catch(Exception e)
		{
			System.out.println("error excuating notepad ");//here if try block does not execuate it handle that and prints the s.o.pln
		}
		System.out.println("Notepad returned "+p.exitValue());//here returns the value by the subprocess when it is finished when there is no problen then it returns 0

	}

}
