package day5;

import java.util.Scanner;

public class Exampletwo {
    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        System.out.print("Please enter a decimal number");
        double number = in.nextDouble();

        number = Math.round(number = 100) / 100.0;
        System.out.println(number);

        int inumber = in.nextInt();
        number = (int) Math.round(inumber / 100.0) * 100;
        System.out.println(number);
    }
    
    
    
    }
    
}
