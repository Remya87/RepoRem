package com.obqura.autos;

public class Circle extends Shape {
	
	double radius; 
	
	public Circle() 
	{ 
	super ( ) ; 
	}
	
	public Circle(String color, double radius) 
	{
	super("circle",color);
	this.radius=radius;

	}
	public String print() { 
		
		return super.display() +" Radius " +radius ;
}

	
}