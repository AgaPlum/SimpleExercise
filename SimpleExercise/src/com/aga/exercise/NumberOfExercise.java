package com.aga.exercise;

import java.util.HashMap;
import java.util.Map;

public enum NumberOfExercise {	
	first (1),
	second (2),
	third (3),
	fourth (4),
	fifth (5)
	;
	
	private final int numerOut;
	private static Map map=new HashMap<>();
	
	NumberOfExercise(int numberIn)
	{
		this.numerOut=numberIn;
	}
	public int getNumberOut()
	{
		return this.numerOut;
	}
	static
	{
		for(NumberOfExercise num:NumberOfExercise.values())
		{
			map.put(num.numerOut,num);
		}
	}
	public static NumberOfExercise valueOf(int number) {
		return (NumberOfExercise) map.get(number);
	}
		
}

