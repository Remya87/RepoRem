package com.obqura.autos;


public class Shape {
	String name; 
	String color;
	
	public Shape () 
	{ 
		super(); // super used to invoke parent Class 
	}
		public Shape(String name, String color) 
		{ 
		super(); 
		this.name=name; 
		this.color=color; 
		}

		public String display() 
		{
	     return "Name: " +name +" Color "+ color ; 
		}
}
