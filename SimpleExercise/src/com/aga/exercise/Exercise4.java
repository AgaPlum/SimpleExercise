package com.aga.exercise;
/* Write a function that given a list of non negative integers,
 * arranges them such that they form the largest possible number.
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 */
public class Exercise4 extends Exercise {
	Exercise4(){
			int []list=new int[]{2,1,9,60,70};
			nonNegativeInteger(list);
		}
		private void nonNegativeInteger(int[] list)
		{
			int n=list.length;
			String number = "";
			int a=0;
			for(int i=0;i<n;i++) {
				for(int j=1;j<(n-i);j++)
				{
					if(list[j-1]<list[j])
					{
					a=list[j-1];
					list[j-1]=list[j];
					list[j]=a;	
					}
				}				
			}

	        for (Integer integer : list) {
	            number += integer.toString();
	        }
	        System.out.println(number);

		}
}
