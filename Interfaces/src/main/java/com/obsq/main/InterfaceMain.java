package com.obsq.main;

import com.obsq.interfaces.Googlepay;
import com.obsq.interfaces.Payment;
import com.obsq.interfaces.Phonepay;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment gpay = new Googlepay();
		gpay.test();
		System.out.println("Payment Success " +gpay.pay(4000));
		
		Payment pp = new Phonepay();
		pp.test();
		System.out.println("Payment Success " +pp.pay(2000));
		

	}

}
