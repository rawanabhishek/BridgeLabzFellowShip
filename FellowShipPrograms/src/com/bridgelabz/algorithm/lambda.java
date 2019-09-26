package com.bridgelabz.algorithm;

public class lambda {
	
	
	long sum(int a,long b)
	{
		return a+b;
	}
	long sum(long a,int b)
	{
		return a+b;
	}


	public static void main(String[] args) {
         
		lambda obj=new lambda();
		System.out.println(obj.sum(1, 2l));
		
            
	}

}
