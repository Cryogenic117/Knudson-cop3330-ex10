/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double tax = 0.055, subtotal = 0, temp, tax_amount;
        String collector;
        int counter =1;

        for (int i = 0; i < 3; i++) {

            System.out.printf("Enter the price of item %d: ", counter);
            collector = input.nextLine();
            temp = Double.valueOf(collector);
            System.out.printf("Enter the quantity of item %d: ", counter);
            collector = input.nextLine();
            temp = temp * Double.valueOf(collector);

            subtotal += temp;
            counter += 1;
        }

        tax_amount = subtotal * tax;
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax_amount);
        System.out.printf("Total: $%.2f%n", subtotal + tax_amount);

    }
}
