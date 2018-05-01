package com.aga.exercise;

import java.util.Scanner;

public class Exercise {
	private static Scanner sc;
	private static NumberOfExercise num;
	private Exercise a;
	
	public Exercise() {
		super();
		this.a = a;
	}
	
	public void chooseExercise()
	{
		System.out.println("Choose which exercise you want to check first:");
		try {		
			System.out.printf("-- First task choose 1 %n-- Second task choose 2"
				+ "%n-- Third task choose 3 %n-- Forth task choose 4"
				+ "%n-- Fifth task choose 5%n");
		sc = new Scanner(System.in);
		int numberOfExercise= sc.nextInt();
		num=NumberOfExercise.valueOf(numberOfExercise);
		System.out.println("You choose "+num.name()+" exercise.");

		if(num.name().equals("first"))
		{
			a=new Exercise1();
		}
		if(num.name().equals("second"))
		{
			a=new Exercise2();
		}
		if(num.name().equals("third"))
		{
			a=new Exercise3();
		}
		if(num.name().equals("fourth"))
		{
			a=new Exercise4();
		}
		if(num.name().equals("fifth"))
		{
			a=new Exercise5();
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong or you choose wrong number.");
		}
	
	}
}
