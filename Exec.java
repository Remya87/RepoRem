package com.obsqura.main;
import java.util.Arrays;

public class Exec {

  

    public static void main(String[] args) {
   
        if (args.length > 0) {
        	 System.out.println("List of arguments: {}"+ Arrays.toString(args));
        }
    }
}