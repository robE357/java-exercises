package org.launchcode.java;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        double Area;
        double pi = 3.14;
        double radius;

        System.out.println("Enter the radius of the circle:");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        Area = pi * radius * radius;

        System.out.print("The area of the circle is: " + Area);



    }
}
