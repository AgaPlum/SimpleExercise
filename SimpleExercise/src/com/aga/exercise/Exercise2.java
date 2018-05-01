package com.aga.exercise;

/*Write a function that combines two lists by alternatingly taking elements.
For example: given the two lists [a, b, c] and [1, 2, 3], 
the function should return [a, 1, b, 2, c, 3].*/

public class Exercise2 extends Exercise {
	Exercise2()
	{
		char[] listB=new char[] {'1','2','3'};
		char[] listA=new char[] {'a','b','c'};
		combinationOfNumbers(listA, listB, listA.length+listB.length);
	}
	private void combinationOfNumbers(char[] listA,char[] listB,int wide)
	{
		char[] listC=new char[wide];
		int z=0;
		for(int i =0;i<listC.length;i++)
		{
			if(i==0)
			{
			//listC[i]=Integer.toString(listA[z]).charAt(0);
				listC[i]=listA[z];
			}
			if(i%2==0) {
			//listC[i]=(char)listA[z];
				listC[i]=listA[z];
			}
			else {
			listC[i]=listB[z];
			z++;
			}
			System.out.println(listC[i]);
		}
	}
}
