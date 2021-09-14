/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise19;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner wh = new Scanner(System.in);

        System.out.print("Please enter in your weight: ");

        float weight = wh.nextFloat();

        System.out.print("Please enter in your height: ");

        float height = wh.nextFloat();

        float BMI;

        if(weight != (float)weight | height != (float)height ){

            System.out.print("Please enter a number : ^ ) ");

            return;
        }

        if(weight == (float)weight & height == (float)height) {

            BMI = (weight / (height * height)) * 703;

            System.out.printf("Your BMI is %f\n ", BMI);

            if(BMI < 25 & BMI > 18) {

                System.out.print("You are in the idea range\n ");

            }

            else if(BMI < 18) {

                System.out.print("You are underweight, you should see a doctor\n ");
            }

            else if(BMI >25) {

                System.out.print("You are overweight, you should see a doctor\n ");
            }
        }













    }
}
