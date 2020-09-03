package com.eshanvi.chapter16;

public class ExecDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		Process p=null; 
		try
		{
			p=r.exec("notepad"); //here by using  exec () method it returns a process object it is used to lunch notepad 
		}catch(Exception e)
		{
			System.out.println("Error excuting notepad.");
		}
	}

}
