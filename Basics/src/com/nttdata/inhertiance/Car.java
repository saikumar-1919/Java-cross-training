package com.nttdata.inhertiance;

public class Car extends Vehicle
{
	Engine engine;

	public Car(int wheels, int numberOfSeats, Engine engine) 
	{
		super(wheels, numberOfSeats);
		this.engine = engine;
	}
	void display2()
	{
		   System.out.println("details of car");
		   System.out.println("wheels : "+wheels);
		   System.out.println("number of seats :"+numberOfSeats);
		   System.out.println("engine number :"+engine.engineNo);
		   System.out.println("enginecc : "+engine.engineCC);
	}
	

}
