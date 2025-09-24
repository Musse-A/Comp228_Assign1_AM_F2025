package com.am.week1.assign1;
import java.util.Scanner;

//@author Ayan M
//@since 2025-09-25
//Program will perform the following tasks 
//Convert volumes L to Gallons

public class LitersToGallons {
	public void ConvertLiters(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Liters to convert to Gallons: ");
            double liters = scanner.nextDouble();
            double gallons = liters * 0.2641720524;
            System.out.println(liters + " Liters = " + gallons + " Gallons");
        }
}
}