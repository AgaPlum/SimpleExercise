package com.aga.exercise;

/*Write three functions that compute the sum of the numbers in
 * a given list using a for-loop, a while-loop, and recursion.*/

public class Exercise1 extends Exercise{
	private int[] array;
	private static int count=0;
	private int b=0;
	Exercise1()
	{
		array=new int[] {1,2,3,4,5,6,7,8,9};
		function1(array);
		function2(array);
		System.out.println("Recusion");
		function3(array);
		System.out.println(b);
	}
	
	private void function1(int[] list)
	{
		System.out.println("For-loop");
		int a=0;
		for(int i=0;i<list.length;i++)
		{
			a=list[i]+a;
		}
		System.out.println(a);
	}
	private void function2(int[] list)
	{
		System.out.println("While-loop");
		int a=0;
		int i=0;
		while(list.length>i){
			a=list[i]+a;
			i++;
		}
		System.out.println(a);
	}
	private void function3(int[] list)
	{
		if(count<list.length)
		{
			b=list[count]+b;
			count++;
			function3(list);
		}
	}
	
}
