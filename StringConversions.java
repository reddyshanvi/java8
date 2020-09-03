package com.eshanvi.chapter16;

public class StringConversions {

	public static void main(String[] args) {
		int num=19648; //here we are initialzing a instance variable with 19648
		System.out.println(num+"in binary: "+Integer.toBinaryString(num));// here we are converting a whole number to binay we are using toBinaryString(num)  by Integer object then it prints in binary form
		System.out.println(num+"in hexadecimal: "+Integer.toHexString(num));// here also we are converting into hexadecimal by using tohexastring(num) then it prints in hexadecimal form
		System.out.println(num+"in octal: "+Integer.toOctalString(num));// here also we are converting a whole number into octal by using tooctalstring(num);

	}

}
