package com.aga.exercise;
/*Write a function that computes the list of the first 100 Fibonacci numbers. 
 *By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 *and each subsequent number is the sum of the previous two. As an example,
 *here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.*/
//{\displaystyle F_{n}=F_{n-1}+F_{n-2},}
public class Exercise3 extends Exercise {
	Exercise3(){
		fibonnaciNumber();
	}
	private void fibonnaciNumber() {
	int[] fibonnaci=new int[100];
	fibonnaci[0]=0;
	fibonnaci[1]=1;
	System.out.printf(fibonnaci[0]+"%n"+fibonnaci[1]+"%n");
	for(int i=2;i<fibonnaci.length;i++)
		{
			fibonnaci[i]=fibonnaci[i-1]+fibonnaci[i-2];
			System.out.println(fibonnaci[i]);
		}
	}
}
