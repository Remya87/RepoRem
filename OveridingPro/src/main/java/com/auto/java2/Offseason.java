package com.auto.java2;

import java.util.Scanner;

import com.auto.java.Onseason;

public class Offseason {
	
	static double discounts = 0.15;

    public static void discount(double cost){
        System.out.printf("Off-season goods will cost:"+ (cost*discounts));
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter cost: ");
        double cost = in.nextDouble();

        Onseason.discount(cost);
        Offseason.discount(cost);
    }
}


