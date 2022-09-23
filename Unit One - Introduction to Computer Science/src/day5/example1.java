package day5;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter the radius");
    double radius = in.nextDouble();

    double area = Math.PI* radius * radius;

    System.out.println("The area of the cicrle with radius " + radius + "is " + area);
    in.close(); 


    
    
    }
}
