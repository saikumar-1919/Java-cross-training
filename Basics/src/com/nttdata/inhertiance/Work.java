package com.nttdata.inhertiance;

public class Work 
{
	public static void main(String[] args) 
	{
		Bus b = new Bus(3, 56, new Engine(15, "130cc"));
		Car c = new Car(4, 4, new Engine(12, "150cc"));
		b.display();
		System.out.println(".............");
		c.display2();
	}

}
