package com.am.week1.assign1;
import java.util.Scanner;
//@author Ayan M
//@since 2025-09-25
//Program will perform the following tasks 
//Calculate and store student grades for various subjects


public class GradeCalculation {
	public void GradeCalc() {

        /*
         * Logic for grade calculation...
         */

        int marks[] = new int[6];
        int i;
        float total = 0, avg;

        try (Scanner scanner = new Scanner(System.in)) {
            for (i = 0; i < 6; i++) {

                System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                total = total + marks[i];
            }
            scanner.close();
        }

        // Calculating average here
        avg = total / 6;

        /*
         * modify this as per your outline...
         */
        System.out.print("The student Grade is: ");
        if (avg >= 90) {
            System.out.print("A");
        } else if (avg >= 80 && avg < 90) {
            System.out.print("B");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("C");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }

}
}