package day3;

public class examplethree {
    public static void main(String[] args) {
    // System.out.println(17 / 5);
    // % a number by 10^x will give x+1 numbers from the right side
    // / a number by 10^x will give us x numbers from the left side
    int number = 63848; 
    int digit1 = number % 10 / 1;
    int digit2 = number % 100 / 10; 
    int digit3 = number % 1000 / 100; 
    int digit4 = number % 10000 / 1000; 
    int digit5 = number % 100000 / 10000;

    int sum = digit1 + digit2 + digit3 + digit4 + digit5; 




    System.out.println(sum);






    }
    
}
