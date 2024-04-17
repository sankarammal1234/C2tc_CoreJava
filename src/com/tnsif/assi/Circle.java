package com.tnsif.assi;

import java.util.Scanner;
public class Circle
{
               double radius;
               String color;
               Scanner scanner = new Scanner(System.in);
            // Method to accept details of the circle
               public void getInput() {
                       System.out.println("Enter Radius:");
                       radius = scanner.nextDouble();
                       System.out.println("Enter Colour:");
                       color = scanner.nextLine();}
               public void calcArea() {
                       double area = Math.PI * radius * radius;
                       System.out.println("Area of the Circle:"+area);
                       }
              public static void main(String[] args) {
            	  Circle c=new Circle();
            	  c.getInput();
            	  c.calcArea();
        
    }
}