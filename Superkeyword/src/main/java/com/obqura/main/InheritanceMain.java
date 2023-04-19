package com.obqura.main;

import com.obqura.autos.Circle;
import com.obqura.autos.Shape;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape s1 = new Shape("test","blue");
		System.out.println(s1.display());
		
		Circle s2= new Circle("blue",5.0);
		System.out.println(s2.print());
	}

}
