package com.tnsif.assi;

import java.util.Scanner;
public class commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter Address:");
        address = scanner.nextLine();
        System.out.println("Enter Phone:");
        phone = scanner.nextLine();
        System.out.println("Enter Sales Amount:");
        salesAmount = scanner.nextDouble();
  
    }
  
    public void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }
        System.out.println("Commission: " + commission);
    }



    public static void main(String[] args) {
        // Creating an object of Commission class
        commission salesEmployee = new commission();

        // Calling the method to accept details of the sales employee
        salesEmployee.acceptDetails();

        // Calling the method to calculate commission
        salesEmployee.calculateCommission();
    }
    }
