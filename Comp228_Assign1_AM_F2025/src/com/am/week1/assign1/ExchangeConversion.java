
package com.am.week1.assign1;
import java.util.Scanner;

//@author Ayan M
//@since 2025-09-25
//Program will perform the following tasks 
//Convert Canadian currency to US dollars.

public class ExchangeConversion {
	 public void ConvertExchange(){
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("Enter Canadian currency to convert to US Dollars: ");
	            double canDollars = scanner.nextDouble();
	            double usDollars = canDollars * 0.73;
	            System.out.println(canDollars + " CAD = " + usDollars + " USD");
	        }
}
}