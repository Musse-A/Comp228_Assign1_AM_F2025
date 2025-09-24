package com.am.week1.assign1.Driver;

import java.util.Scanner;

import com.am.week1.assign1.ExchangeConversion;
import com.am.week1.assign1.GradeCalculation;
import com.am.week1.assign1.LitersToGallons;
import com.am.week1.assign1.MilesToKms;


/* @author Ayan M
 * @since 2025-09-25
 * Program will perform the following tasks 
 * Calculate and store student grades for various subjects
Convert Distance miles to kilometers
Convert volumes L to Gallons, 
Convert Canadian currency to US dollars.
 */
		


public class DriverMain {

    public static void main(String[] args) {


        /*
         * Create objects for classes of Task a-d.
         *
         *
         */

        // for example tasks grade calculation goes as below
        GradeCalculation gc = new GradeCalculation();
        MilesToKms mk = new MilesToKms();
        LitersToGallons lg = new LitersToGallons();
        ExchangeConversion ec = new ExchangeConversion();




// create objects for all the classes..  and then call the method using switch case..

        System.out.println("Enter the choice for operation  1.GradeCacluation, 2.MilestoKms, 3.LiterstoGallons, 4.ExchangeRate, ");
        try (Scanner sc = new Scanner(System.in)) {
            int choice=sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Doing Grade Calculation");
                    gc.GradeCalc();
                    break;
                case 2:
                    System.out.println("Doing Distance Calculation");
                    mk.ConvertMiles();
                    break;
                case 3:
                    System.out.println("Doing Volume Calculation");
                    lg.ConvertLiters();
                    break;
                case 4:
                    System.out.println("Doing Exchange Rate Calculation");
                    ec.ConvertExchange();
                    break;
            }
        }

    }

}