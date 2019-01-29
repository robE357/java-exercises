package org.launchcode.java;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        double area = 0;
        double pi = 3.14;
        double radius;



        while (area == 0) {

            System.out.println("Enter the radius of the circle:");
            Scanner scan = new Scanner(System.in);

            radius = scan.nextDouble();

            if (radius <= 0) {
                System.out.println("Only Positive Numbers & no Letters Please!");
            } else {
                area = pi * radius * radius;
                System.out.print("The area of the circle is: " + area);
            }
        }
    }
}
