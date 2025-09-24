package com.am.week1.assign1;

import java.util.Scanner;

//@author Ayan M
//@since 2025-09-25
//Program will perform the following tasks 
//Convert Distance miles to kilometers

public class MilesToKms {
	public void ConvertMiles(){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter distance in Miles: ");
            double miles = scanner.nextDouble();
            double kms = miles * 1.60934;
            System.out.println(miles + " miles = " + kms + " kilometers");
        }
    }

}

