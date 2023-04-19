package com.obsq.interfaces;

public class Googlepay implements Payment{

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("pay using Gpay");
		return  amount < 5000;
	}
	

	
	
	
	
	
	

}
