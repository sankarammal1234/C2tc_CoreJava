package com.tnsif.assi;

import java.util.Scanner;
class student {
    String fullName;
    String rollNumber;
    char grade;
    double percentage;

    
    public student() {
        System.out.println("Student object is created");
    }

    
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        fullName = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextLine();

        System.out.print("Enter Grade: ");
        grade = scanner.next().charAt(0);

        System.out.print("Enter Percentage: ");
        percentage = scanner.nextDouble();
    }

   
    public void displayDetails() {
        System.out.println("Full Name with Initial: " + fullName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        student student = new student(); 
        student.inputDetails(); 
        System.out.println(); 
        student.displayDetails(); 
    }
}