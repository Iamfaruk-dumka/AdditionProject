package com.tcs;

public class Add {

	public int sub(int a, int b)
	{
		int c = a-b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result;
		result=num1+num2;
		System.out.println("Addition of two number "+result);
		
		Add s= new Add();
		s.sub(5,3);
	}
	
	
}
