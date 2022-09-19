package day3;

public class Exampleone {
    public static void main(String[] args) {
        /*
         * Primitive data types
         * Variables 
         */
        // variables are meant to store and eventually recall data/information
        // the data could be anything(number, a string of characters, ture or false, list of accounts,etc)
        // before we use a variable we MUST declare it
        // when we declare a variable we must state the type of data it will hold


        // primitive types store the value (THEY ARE PRIMITIVE)

        // int -> interger 
        // double -> decimal numbers
        // boolean -> true or false

        int numberofstudents = 14;    // number of students has been declared as an int
        double testaverage = 63.7;   // declared and intiazlied on the same line
        final double PI = 3.14; // if the variable CANNOT by modified after it has been intilized then make it final
        //PI=6.2;        syntax error (wont complete becasue pi is final)
        // naming convention for constants (final) is All_UPPER_CASE_CASE_WITH_SPACES_BETWEEN_WORDS

        boolean isheads = false;
        boolean hastoes = true;

        System.out.println("There are " + numberofstudents + " in the class");
        System.out.println("5 + 3  = " + 5 + 3);
        System.out.println("5 + 3  = " + (5 + 3));


    

    }
}
