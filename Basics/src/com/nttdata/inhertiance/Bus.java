package com.nttdata.inhertiance;

public class Bus extends Vehicle
{
   Engine engine;

   public Bus(int wheels, int numberOfSeats, Engine engine) 
   {
	super(wheels, numberOfSeats);
	this.engine = engine;
   }
   void display()
   {
	   System.out.println("details of bus");
	   System.out.println("wheels : "+wheels);
	   System.out.println("number of seats :"+numberOfSeats);
	   System.out.println("engine number :"+engine.engineNo);
	   System.out.println("enginecc : "+engine.engineCC);
   }
   
   



}
