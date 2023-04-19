package com.obsq.interfaces;

public class Phonepay implements Payment{

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("pay using phone pay");
		return amount < 3000;
	}
	
    public void test()
	
	{
		
		System.out.println("test pp");
	}

}
