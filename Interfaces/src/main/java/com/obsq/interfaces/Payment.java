package com.obsq.interfaces;

public interface Payment {
	
	int Time_out = 3000;
	
	boolean pay(double amount);
	
	default void test()
	
	{
		
		System.out.println("test");
	}

}
